package com.mob.app.modules.seasonsplaying.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonsplayingBinding
import com.mob.app.modules.seasonsplaying.`data`.viewmodel.SeasonsplayingVM
import com.mob.app.modules.seasonsplayingtwo.ui.SeasonsplayingtwoActivity
import kotlin.String
import kotlin.Unit

class SeasonsplayingActivity :
    BaseActivity<ActivitySeasonsplayingBinding>(R.layout.activity_seasonsplaying) {
  private val viewModel: SeasonsplayingVM by viewModels<SeasonsplayingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seasonsplayingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = SeasonsplayingtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEASONSPLAYING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonsplayingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
