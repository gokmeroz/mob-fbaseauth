package com.mob.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityLoginBinding
import com.mob.app.modules.learning.ui.LearningActivity
import com.mob.app.modules.login.`data`.viewmodel.LoginVM
import com.mob.app.modules.signup.ui.SignupActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_SIGNUP_ACTIVITY: Int = 845

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowlogin.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGNUP_ACTIVITY)
    }
    binding.linearRowloginOne.setOnClickListener {
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
