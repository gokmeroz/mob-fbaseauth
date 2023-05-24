package com.mob.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySignupBinding
import com.mob.app.modules.introduction.ui.IntroductionActivity
import com.mob.app.modules.login.ui.LoginActivity
import com.mob.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 943


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowlogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
    }
    binding.linearRowsignupOne.setOnClickListener {
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
