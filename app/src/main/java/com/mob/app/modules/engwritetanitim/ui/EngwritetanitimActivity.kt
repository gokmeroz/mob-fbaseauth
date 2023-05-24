package com.mob.app.modules.engwritetanitim.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngwritetanitimBinding
import com.mob.app.modules.engwrite.ui.EngwriteActivity
import com.mob.app.modules.engwritetanitim.`data`.viewmodel.EngwritetanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngwritetanitimActivity :
    BaseActivity<ActivityEngwritetanitimBinding>(R.layout.activity_engwritetanitim) {
  private val viewModel: EngwritetanitimVM by viewModels<EngwritetanitimVM>()

  private val REQUEST_CODE_ENGWRITE_ACTIVITY: Int = 359

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engwritetanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngwriteActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGWRITE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGWRITETANITIM_ACTIVITY"

  }
}
