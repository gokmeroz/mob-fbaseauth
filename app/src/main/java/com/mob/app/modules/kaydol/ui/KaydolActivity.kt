package com.mob.app.modules.kaydol.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityKaydolBinding
import com.mob.app.modules.girisyap.ui.GirisyapActivity
import com.mob.app.modules.kaydol.`data`.viewmodel.KaydolVM
import com.mob.app.modules.tanitim.ui.TanitimActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KaydolActivity : BaseActivity<ActivityKaydolBinding>(R.layout.activity_kaydol) {
  private val viewModel: KaydolVM by viewModels<KaydolVM>()
  lateinit var etEmail: EditText
  lateinit var etConfPass: EditText
  private val REQUEST_CODE_GIRISYAP_ACTIVITY: Int = 480

  private lateinit var etPass: EditText
  private lateinit var btnSignUp: Button
  lateinit var tvRedirectLogin: TextView
  private lateinit var auth: FirebaseAuth
  @SuppressLint("MissingInflatedId")
  override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_kaydol)

    // View Bindings
    etEmail = findViewById(R.id.etEmailKaydol)
    etConfPass = findViewById(R.id.etIsimEditKaydol)
    etPass = findViewById(R.id.etSifreOlusturKay)
    btnSignUp = findViewById(R.id.btn_kaydol)
    tvRedirectLogin = findViewById(R.id.btnGiriYap)

    // Initialising auth object
    auth = FirebaseAuth.getInstance()

    btnSignUp.setOnClickListener {
      signUpUser()
    }

    // switching from signUp Activity to Login Activity
    tvRedirectLogin.setOnClickListener {
      val intent = Intent(this, GirisyapActivity::class.java)
      startActivity(intent)
    }

  }

  private fun signUpUser() {
    val email = etEmail.text.toString()
    val pass = etPass.text.toString()
    val confirmPassword = etConfPass.text.toString()

    // check pass
    if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
      Toast.makeText(this, "Email and Password can't be blank", Toast.LENGTH_SHORT).show()
      return
    }

    if (pass != confirmPassword) {
      Toast.makeText(this, "Password and Confirm Password do not match", Toast.LENGTH_SHORT)
        .show()
      return
    }
    // If all credential are correct
    // We call createUserWithEmailAndPassword
    // using auth object and pass the
    // email and pass in it.
    auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
      if (it.isSuccessful) {
        Toast.makeText(this, "Successfully Singed Up", Toast.LENGTH_SHORT).show()
        val destIntent = TanitimActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_GIRISYAP_ACTIVITY)
      } else {
        Toast.makeText(this, "Singed Up Failed!", Toast.LENGTH_SHORT).show()
      }
    }
  }
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kaydolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    /*
    binding.linearRowdevam.setOnClickListener {
      val destIntent = TanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
     */


    binding.linearRowgiriyap.setOnClickListener {
      val destIntent = TanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GIRISYAP_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "KAYDOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KaydolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
