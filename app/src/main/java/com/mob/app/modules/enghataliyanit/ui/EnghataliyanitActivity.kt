package com.mob.app.modules.enghataliyanit.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnghataliyanitBinding
import com.mob.app.modules.enghataliyanit.`data`.viewmodel.EnghataliyanitVM
import com.mob.app.modules.learning.ui.LearningActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EnghataliyanitActivity :
    BaseActivity<ActivityEnghataliyanitBinding>(R.layout.activity_enghataliyanit) {
  private val viewModel: EnghataliyanitVM by viewModels<EnghataliyanitVM>()

  private val REQUEST_CODE_LEARNING_ACTIVITY: Int = 600

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enghataliyanitVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearEngHataliYanit.setOnClickListener {
      finish()
    }
    binding.imageThem.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEARNING_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGHATALIYANIT_ACTIVITY"

  }
}
