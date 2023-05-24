package com.mob.app.modules.seasonsplayingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonsplayingfourBinding
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.seasonsplayingfour.`data`.viewmodel.SeasonsplayingfourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeasonsplayingfourActivity :
    BaseActivity<ActivitySeasonsplayingfourBinding>(R.layout.activity_seasonsplayingfour) {
  private val viewModel: SeasonsplayingfourVM by viewModels<SeasonsplayingfourVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 483

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seasonsplayingfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SEASONSPLAYINGFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonsplayingfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
