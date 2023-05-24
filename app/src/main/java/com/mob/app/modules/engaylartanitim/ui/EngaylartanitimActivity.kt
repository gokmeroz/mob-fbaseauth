package com.mob.app.modules.engaylartanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngaylartanitimBinding
import com.mob.app.modules.engaylartanitim.`data`.viewmodel.EngaylartanitimVM
import com.mob.app.modules.engaylarvideo.ui.EngaylarvideoActivity
import kotlin.String
import kotlin.Unit

class EngaylartanitimActivity :
    BaseActivity<ActivityEngaylartanitimBinding>(R.layout.activity_engaylartanitim) {
  private val viewModel: EngaylartanitimVM by viewModels<EngaylartanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engaylartanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngaylarvideoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGAYLARTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngaylartanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
