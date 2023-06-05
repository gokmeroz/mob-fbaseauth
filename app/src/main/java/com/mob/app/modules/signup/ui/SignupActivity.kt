package com.mob.app.modules.signup.ui

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
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySignupBinding
import com.mob.app.modules.girisyap.ui.GirisyapActivity
import com.mob.app.modules.introduction.ui.IntroductionActivity
import com.mob.app.modules.login.ui.LoginActivity
import com.mob.app.modules.signup.`data`.viewmodel.SignupVM
import com.mob.app.modules.tanitim.ui.TanitimActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()
  private lateinit var firebaseAuth: FirebaseAuth

  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 943
  lateinit var etEmail: EditText
  lateinit var etConfPass: EditText

  private lateinit var etPass: EditText
  private lateinit var btnSignUp: Button
  lateinit var tvRedirectLogin: TextView
  private lateinit var auth: FirebaseAuth
  @SuppressLint("MissingInflatedId")
  override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_signup)

    // View Bindings
    etEmail = findViewById(R.id.etEmailKaydol)
    etConfPass = findViewById(R.id.etIsimEditKaydol)
    etPass = findViewById(R.id.etSifreOlusturKay)
    btnSignUp = findViewById(R.id.btn_signup)
    tvRedirectLogin = findViewById(R.id.btnLogin)

    // Initialising auth object
    auth = FirebaseAuth.getInstance()

    btnSignUp.setOnClickListener {
      signUpUser()
    }

    // switching from signUp Activity to Login Activity
    tvRedirectLogin.setOnClickListener {
      val intent = Intent(this, LoginActivity::class.java)
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
        val destIntent = IntroductionActivity.getIntent(this, null)
        startActivity(destIntent)
      } else {
        Toast.makeText(this, "Singed Up Failed!", Toast.LENGTH_SHORT).show()
      }
    }
  }
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    /*
    binding.linearRowlogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
    }

     */

    binding.linearRowlogin.setOnClickListener {
      val destIntent = IntroductionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGNUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
