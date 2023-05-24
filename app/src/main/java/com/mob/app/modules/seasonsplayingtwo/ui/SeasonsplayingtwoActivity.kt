package com.mob.app.modules.seasonsplayingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonsplayingtwoBinding
import com.mob.app.modules.seasonsplayingthree.ui.SeasonsplayingthreeActivity
import com.mob.app.modules.seasonsplayingtwo.`data`.viewmodel.SeasonsplayingtwoVM
import kotlin.String
import kotlin.Unit

class SeasonsplayingtwoActivity :
    BaseActivity<ActivitySeasonsplayingtwoBinding>(R.layout.activity_seasonsplayingtwo) {
  private val viewModel: SeasonsplayingtwoVM by viewModels<SeasonsplayingtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seasonsplayingtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = SeasonsplayingthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEASONSPLAYINGTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonsplayingtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
