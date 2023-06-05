package com.mob.app.modules.login.ui

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
import com.mob.app.databinding.ActivityLoginBinding
import com.mob.app.modules.kaydol.ui.KaydolActivity
import com.mob.app.modules.learning.ui.LearningActivity
import com.mob.app.modules.login.`data`.viewmodel.LoginVM
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import com.mob.app.modules.signup.ui.SignupActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_SIGNUP_ACTIVITY: Int = 845
  private lateinit var tvRedirectSignUp: TextView
  lateinit var etEmail: EditText
  private lateinit var etPass: EditText
  lateinit var btnLogin: Button


  lateinit var auth: FirebaseAuth
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

    // View Binding
    tvRedirectSignUp = findViewById(R.id.btnSignUp)
    btnLogin = findViewById(R.id.btn_login)
    etEmail = findViewById(R.id.etEdit)
    etPass = findViewById(R.id.etPassword)

    // initialising Firebase auth object
    auth = FirebaseAuth.getInstance()

    btnLogin.setOnClickListener {
      login()
      val destIntent = LearningActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    tvRedirectSignUp.setOnClickListener {
      val intent = Intent(this, SignupActivity::class.java)
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
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    /*
    binding.linearRowlogin.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGNUP_ACTIVITY)
    }
     */
    binding.btnLogin.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
