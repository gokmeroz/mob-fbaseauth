package com.mob.app.modules.hizliokumatanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityHizliokumatanitimBinding
import com.mob.app.modules.hizliokuma.ui.HizliokumaActivity
import com.mob.app.modules.hizliokumatanitim.`data`.viewmodel.HizliokumatanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HizliokumatanitimActivity :
    BaseActivity<ActivityHizliokumatanitimBinding>(R.layout.activity_hizliokumatanitim) {
  private val viewModel: HizliokumatanitimVM by viewModels<HizliokumatanitimVM>()

  private val REQUEST_CODE_HIZLIOKUMA_ACTIVITY: Int = 249

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hizliokumatanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = HizliokumaActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HIZLIOKUMA_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "HIZLIOKUMATANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HizliokumatanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
