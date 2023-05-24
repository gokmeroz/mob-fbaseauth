package com.mob.app.modules.carpmatanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmatanitimBinding
import com.mob.app.modules.carpmakonuanlatim.ui.CarpmakonuanlatimActivity
import com.mob.app.modules.carpmatanitim.`data`.viewmodel.CarpmatanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmatanitimActivity :
    BaseActivity<ActivityCarpmatanitimBinding>(R.layout.activity_carpmatanitim) {
  private val viewModel: CarpmatanitimVM by viewModels<CarpmatanitimVM>()

  private val REQUEST_CODE_CARPMAKONUANLATIM_ACTIVITY: Int = 267


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carpmatanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCarpmaTanitim.setOnClickListener {
      val destIntent = CarpmakonuanlatimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CARPMAKONUANLATIM_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "CARPMATANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmatanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
