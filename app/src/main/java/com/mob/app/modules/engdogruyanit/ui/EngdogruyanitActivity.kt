package com.mob.app.modules.engdogruyanit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngdogruyanitBinding
import com.mob.app.modules.engdogruyanit.`data`.viewmodel.EngdogruyanitVM
import com.mob.app.modules.learning.ui.LearningActivity
import com.mob.app.modules.playing.ui.PlayingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngdogruyanitActivity :
    BaseActivity<ActivityEngdogruyanitBinding>(R.layout.activity_engdogruyanit) {
  private val viewModel: EngdogruyanitVM by viewModels<EngdogruyanitVM>()

  private val REQUEST_CODE_PLAYING_ACTIVITY: Int = 514


  private val REQUEST_CODE_LEARNING_ACTIVITY: Int = 429


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engdogruyanitVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearEngDogruYanit.setOnClickListener {
      val destIntent = PlayingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_PLAYING_ACTIVITY)
    }
    binding.imageHomeEleven.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEARNING_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGDOGRUYANIT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngdogruyanitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
