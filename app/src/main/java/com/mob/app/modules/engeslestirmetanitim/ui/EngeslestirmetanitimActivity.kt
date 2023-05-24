package com.mob.app.modules.engeslestirmetanitim.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmetanitimBinding
import com.mob.app.modules.engeslestirmesecim.ui.EngeslestirmesecimActivity
import com.mob.app.modules.engeslestirmetanitim.`data`.viewmodel.EngeslestirmetanitimVM
import kotlin.String
import kotlin.Unit

class EngeslestirmetanitimActivity :
    BaseActivity<ActivityEngeslestirmetanitimBinding>(R.layout.activity_engeslestirmetanitim) {
  private val viewModel: EngeslestirmetanitimVM by viewModels<EngeslestirmetanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engeslestirmetanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngeslestirmesecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMETANITIM_ACTIVITY"

  }
}
