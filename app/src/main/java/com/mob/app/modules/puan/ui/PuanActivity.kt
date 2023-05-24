package com.mob.app.modules.puan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPuanBinding
import com.mob.app.modules.puan.`data`.viewmodel.PuanVM
import com.mob.app.modules.skortablo.ui.SkortabloActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PuanActivity : BaseActivity<ActivityPuanBinding>(R.layout.activity_puan) {
  private val viewModel: PuanVM by viewModels<PuanVM>()

  private val REQUEST_CODE_SKORTABLO_ACTIVITY: Int = 210

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.puanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearPuan.setOnClickListener {
      val destIntent = SkortabloActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SKORTABLO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "PUAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PuanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
