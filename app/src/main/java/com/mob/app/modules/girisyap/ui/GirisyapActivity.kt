package com.mob.app.modules.girisyap.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import com.google.firebase.auth.FirebaseAuth
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityGirisyapBinding
import com.mob.app.modules.girisyap.`data`.viewmodel.GirisyapVM
import com.mob.app.modules.kaydol.ui.KaydolActivity
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GirisyapActivity : BaseActivity<ActivityGirisyapBinding>(R.layout.activity_girisyap) {
  private val viewModel: GirisyapVM by viewModels<GirisyapVM>()
  private lateinit var tvRedirectSignUp: TextView
  lateinit var etEmail: EditText
  private lateinit var etPass: EditText
  lateinit var btnLogin: Button

  private val REQUEST_CODE_KAYDOL_ACTIVITY: Int = 735

  lateinit var auth: FirebaseAuth
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_girisyap)

    // View Binding
    tvRedirectSignUp = findViewById(R.id.btnKaydol)
    btnLogin = findViewById(R.id.btn_giris)
    etEmail = findViewById(R.id.etEmailEditGiris)
    etPass = findViewById(R.id.etSifreGiris)

    // initialising Firebase auth object
    auth = FirebaseAuth.getInstance()

    btnLogin.setOnClickListener {
      login()
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    tvRedirectSignUp.setOnClickListener {
      val intent = Intent(this, KaydolActivity::class.java)
      startActivity(intent)
      // using finish() to end the activity
      finish()
    }
  }

  private fun login() {
    val email = etEmail.text.toString()
    val pass = etPass.text.toString()
    // calling signInWithEmailAndPassword(email, pass)
    // function using Firebase auth object
    // On successful response Display a Toast
    auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
      if (it.isSuccessful) {
        Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
      } else
        Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
    }
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.girisyapVM = viewModel
  }

  override fun setUpClicks(): Unit {
    /*
    binding.linearRowgiriYap.setOnClickListener {
      val destIntent = KaydolActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_KAYDOL_ACTIVITY)
    }
     */

    binding.btnGiris.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivity(destIntent)
    }

  }

  companion object {
    const val TAG: String = "GIRISYAP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GirisyapActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
