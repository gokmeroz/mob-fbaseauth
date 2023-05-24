package com.mob.app.modules.eslestirmerenktwo.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmerenktwoBinding
import com.mob.app.modules.eslestirmerenktwo.`data`.viewmodel.EslestirmerenktwoVM
import kotlin.String
import kotlin.Unit

class EslestirmerenktwoActivity :
    BaseActivity<ActivityEslestirmerenktwoBinding>(R.layout.activity_eslestirmerenktwo) {
  private val viewModel: EslestirmerenktwoVM by viewModels<EslestirmerenktwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eslestirmerenktwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ESLESTIRMERENKTWO_ACTIVITY"

  }
}
