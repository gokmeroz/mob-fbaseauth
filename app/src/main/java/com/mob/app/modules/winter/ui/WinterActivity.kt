package com.mob.app.modules.winter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityWinterBinding
import com.mob.app.modules.engseasonsecim.ui.EngseasonsecimActivity
import com.mob.app.modules.winter.`data`.viewmodel.WinterVM
import kotlin.String
import kotlin.Unit

class WinterActivity : BaseActivity<ActivityWinterBinding>(R.layout.activity_winter) {
  private val viewModel: WinterVM by viewModels<WinterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.winterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameWinter.setOnClickListener {
      val destIntent = EngseasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WINTER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WinterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
