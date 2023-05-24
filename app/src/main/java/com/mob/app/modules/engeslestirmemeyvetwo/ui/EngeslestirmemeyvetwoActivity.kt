package com.mob.app.modules.engeslestirmemeyvetwo.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmemeyvetwoBinding
import com.mob.app.modules.engeslestirmemeyvetwo.`data`.viewmodel.EngeslestirmemeyvetwoVM
import kotlin.String
import kotlin.Unit

class EngeslestirmemeyvetwoActivity :
    BaseActivity<ActivityEngeslestirmemeyvetwoBinding>(R.layout.activity_engeslestirmemeyvetwo) {
  private val viewModel: EngeslestirmemeyvetwoVM by viewModels<EngeslestirmemeyvetwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engeslestirmemeyvetwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMEMEYVETWO_ACTIVITY"

  }
}
