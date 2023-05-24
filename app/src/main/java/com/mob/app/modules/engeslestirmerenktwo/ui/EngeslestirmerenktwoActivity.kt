package com.mob.app.modules.engeslestirmerenktwo.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmerenktwoBinding
import com.mob.app.modules.engeslestirmerenktwo.`data`.viewmodel.EngeslestirmerenktwoVM
import kotlin.String
import kotlin.Unit

class EngeslestirmerenktwoActivity :
    BaseActivity<ActivityEngeslestirmerenktwoBinding>(R.layout.activity_engeslestirmerenktwo) {
  private val viewModel: EngeslestirmerenktwoVM by viewModels<EngeslestirmerenktwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engeslestirmerenktwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMERENKTWO_ACTIVITY"

  }
}
