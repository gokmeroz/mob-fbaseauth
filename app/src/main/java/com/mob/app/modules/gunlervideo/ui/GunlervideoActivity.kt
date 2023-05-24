package com.mob.app.modules.gunlervideo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityGunlervideoBinding
import com.mob.app.modules.gunleregzersiz.ui.GunleregzersizActivity
import com.mob.app.modules.gunlervideo.`data`.viewmodel.GunlervideoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GunlervideoActivity : BaseActivity<ActivityGunlervideoBinding>(R.layout.activity_gunlervideo)
    {
  private val viewModel: GunlervideoVM by viewModels<GunlervideoVM>()

  private val REQUEST_CODE_GUNLEREGZERSIZ_ACTIVITY: Int = 143

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gunlervideoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowhadirendikle.setOnClickListener {
      val destIntent = GunleregzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GUNLEREGZERSIZ_ACTIVITY)
    }
  }


  companion object {
    const val TAG: String = "GUNLERVIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GunlervideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
