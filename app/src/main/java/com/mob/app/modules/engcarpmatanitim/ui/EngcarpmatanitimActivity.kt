package com.mob.app.modules.engcarpmatanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmatanitimBinding
import com.mob.app.modules.engcarpmakonuanlatim.ui.EngcarpmakonuanlatimActivity
import com.mob.app.modules.engcarpmatanitim.`data`.viewmodel.EngcarpmatanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmatanitimActivity :
    BaseActivity<ActivityEngcarpmatanitimBinding>(R.layout.activity_engcarpmatanitim) {
  private val viewModel: EngcarpmatanitimVM by viewModels<EngcarpmatanitimVM>()

  private val REQUEST_CODE_ENGCARPMAKONUANLATIM_ACTIVITY: Int = 500

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engcarpmatanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngcarpmakonuanlatimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGCARPMAKONUANLATIM_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMATANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmatanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
