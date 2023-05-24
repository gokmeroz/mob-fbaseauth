package com.mob.app.modules.yaz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityYazBinding
import com.mob.app.modules.seasonsecim.ui.SeasonsecimActivity
import com.mob.app.modules.yaz.`data`.viewmodel.YazVM
import kotlin.String
import kotlin.Unit

class YazActivity : BaseActivity<ActivityYazBinding>(R.layout.activity_yaz) {
  private val viewModel: YazVM by viewModels<YazVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.yazVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameYaz.setOnClickListener {
      val destIntent = SeasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "YAZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YazActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
