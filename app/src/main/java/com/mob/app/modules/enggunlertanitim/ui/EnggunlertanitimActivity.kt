package com.mob.app.modules.enggunlertanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnggunlertanitimBinding
import com.mob.app.modules.enggunlertanitim.`data`.viewmodel.EnggunlertanitimVM
import com.mob.app.modules.enggunlervideo.ui.EnggunlervideoActivity
import kotlin.String
import kotlin.Unit

class EnggunlertanitimActivity :
    BaseActivity<ActivityEnggunlertanitimBinding>(R.layout.activity_enggunlertanitim) {
  private val viewModel: EnggunlertanitimVM by viewModels<EnggunlertanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enggunlertanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EnggunlervideoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGGUNLERTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnggunlertanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
