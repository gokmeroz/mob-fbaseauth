package com.mob.app.modules.eslestirmemeyvetwo.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmemeyvetwoBinding
import com.mob.app.modules.eslestirmemeyvetwo.`data`.viewmodel.EslestirmemeyvetwoVM
import kotlin.String
import kotlin.Unit

class EslestirmemeyvetwoActivity :
    BaseActivity<ActivityEslestirmemeyvetwoBinding>(R.layout.activity_eslestirmemeyvetwo) {
  private val viewModel: EslestirmemeyvetwoVM by viewModels<EslestirmemeyvetwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eslestirmemeyvetwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ESLESTIRMEMEYVETWO_ACTIVITY"

  }
}
