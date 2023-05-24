package com.mob.app.modules.introduction.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityIntroductionBinding
import com.mob.app.modules.introduction.`data`.viewmodel.IntroductionVM
import com.mob.app.modules.learning.ui.LearningActivity
import kotlin.String
import kotlin.Unit

class IntroductionActivity :
    BaseActivity<ActivityIntroductionBinding>(R.layout.activity_introduction) {
  private val viewModel: IntroductionVM by viewModels<IntroductionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introductionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIntroduction.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INTRODUCTION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntroductionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
