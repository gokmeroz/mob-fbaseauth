package com.mob.app.modules.hataliyanit.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityHataliyanitBinding
import com.mob.app.modules.hataliyanit.`data`.viewmodel.HataliyanitVM
import kotlin.String
import kotlin.Unit

class HataliyanitActivity : BaseActivity<ActivityHataliyanitBinding>(R.layout.activity_hataliyanit)
    {
  private val viewModel: HataliyanitVM by viewModels<HataliyanitVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hataliyanitVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HATALIYANIT_ACTIVITY"

  }
}
