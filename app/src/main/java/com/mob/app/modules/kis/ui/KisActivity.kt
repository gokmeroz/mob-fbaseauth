package com.mob.app.modules.kis.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityKisBinding
import com.mob.app.modules.kis.`data`.viewmodel.KisVM
import com.mob.app.modules.seasonsecim.ui.SeasonsecimActivity
import kotlin.String
import kotlin.Unit

class KisActivity : BaseActivity<ActivityKisBinding>(R.layout.activity_kis) {
  private val viewModel: KisVM by viewModels<KisVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kisVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameKis.setOnClickListener {
      val destIntent = SeasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "KIS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KisActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
