package com.mob.app.modules.gunlertanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityGunlertanitimBinding
import com.mob.app.modules.gunlertanitim.`data`.viewmodel.GunlertanitimVM
import com.mob.app.modules.gunlervideo.ui.GunlervideoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GunlertanitimActivity :
    BaseActivity<ActivityGunlertanitimBinding>(R.layout.activity_gunlertanitim) {
  private val viewModel: GunlertanitimVM by viewModels<GunlertanitimVM>()

  private val REQUEST_CODE_GUNLERVIDEO_ACTIVITY: Int = 679

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gunlertanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearGunlerTanitim.setOnClickListener {
      val destIntent = GunlervideoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GUNLERVIDEO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "GUNLERTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GunlertanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
