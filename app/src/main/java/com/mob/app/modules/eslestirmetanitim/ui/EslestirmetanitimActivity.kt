package com.mob.app.modules.eslestirmetanitim.ui

import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmetanitimBinding
import com.mob.app.modules.eslestirmesecim.ui.EslestirmesecimActivity
import com.mob.app.modules.eslestirmetanitim.`data`.viewmodel.EslestirmetanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EslestirmetanitimActivity :
    BaseActivity<ActivityEslestirmetanitimBinding>(R.layout.activity_eslestirmetanitim) {
  private val viewModel: EslestirmetanitimVM by viewModels<EslestirmetanitimVM>()

  private val REQUEST_CODE_ESLESTIRMESECIM_ACTIVITY: Int = 693

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eslestirmetanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuu.setOnClickListener {
      val destIntent = EslestirmesecimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ESLESTIRMESECIM_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ESLESTIRMETANITIM_ACTIVITY"

  }
}
