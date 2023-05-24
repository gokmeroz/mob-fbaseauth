package com.mob.app.modules.hizliokuma.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityHizliokumaBinding
import com.mob.app.modules.hizliokuma.`data`.viewmodel.HizliokumaVM
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HizliokumaActivity : BaseActivity<ActivityHizliokumaBinding>(R.layout.activity_hizliokuma) {
  private val viewModel: HizliokumaVM by viewModels<HizliokumaVM>()

  private val REQUEST_CODE_OGRENME_ACTIVITY: Int = 930


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hizliokumaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameHizliOkuma.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OGRENME_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "HIZLIOKUMA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HizliokumaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
