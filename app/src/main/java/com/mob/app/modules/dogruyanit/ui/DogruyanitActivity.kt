package com.mob.app.modules.dogruyanit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityDogruyanitBinding
import com.mob.app.modules.dogruyanit.`data`.viewmodel.DogruyanitVM
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import com.mob.app.modules.oyun.ui.OyunActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DogruyanitActivity : BaseActivity<ActivityDogruyanitBinding>(R.layout.activity_dogruyanit) {
  private val viewModel: DogruyanitVM by viewModels<DogruyanitVM>()

  private val REQUEST_CODE_OYUN_ACTIVITY: Int = 742


  private val REQUEST_CODE_OGRENME_ACTIVITY: Int = 670


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dogruyanitVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDogruYanit.setOnClickListener {
      val destIntent = OyunActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OYUN_ACTIVITY)
    }
    binding.imageHomeEleven.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OGRENME_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "DOGRUYANIT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DogruyanitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
