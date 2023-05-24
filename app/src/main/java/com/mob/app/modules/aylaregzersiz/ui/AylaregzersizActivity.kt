package com.mob.app.modules.aylaregzersiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityAylaregzersizBinding
import com.mob.app.modules.aylaregzersiz.`data`.viewmodel.AylaregzersizVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AylaregzersizActivity :
    BaseActivity<ActivityAylaregzersizBinding>(R.layout.activity_aylaregzersiz) {
  private val viewModel: AylaregzersizVM by viewModels<AylaregzersizVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 942


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aylaregzersizVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "AYLAREGZERSIZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AylaregzersizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
