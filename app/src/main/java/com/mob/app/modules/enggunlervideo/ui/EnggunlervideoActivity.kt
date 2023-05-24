package com.mob.app.modules.enggunlervideo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnggunlervideoBinding
import com.mob.app.modules.enggunleregzersiz.ui.EnggunleregzersizActivity
import com.mob.app.modules.enggunlervideo.`data`.viewmodel.EnggunlervideoVM
import kotlin.String
import kotlin.Unit

class EnggunlervideoActivity :
    BaseActivity<ActivityEnggunlervideoBinding>(R.layout.activity_enggunlervideo) {
  private val viewModel: EnggunlervideoVM by viewModels<EnggunlervideoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enggunlervideoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearThose.setOnClickListener {
      val destIntent = EnggunleregzersizActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGGUNLERVIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnggunlervideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
