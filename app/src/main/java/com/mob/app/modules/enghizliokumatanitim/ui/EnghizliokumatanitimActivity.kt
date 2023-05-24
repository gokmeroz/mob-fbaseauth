package com.mob.app.modules.enghizliokumatanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnghizliokumatanitimBinding
import com.mob.app.modules.enghizliokuma.ui.EnghizliokumaActivity
import com.mob.app.modules.enghizliokumatanitim.`data`.viewmodel.EnghizliokumatanitimVM
import kotlin.String
import kotlin.Unit

class EnghizliokumatanitimActivity :
    BaseActivity<ActivityEnghizliokumatanitimBinding>(R.layout.activity_enghizliokumatanitim) {
  private val viewModel: EnghizliokumatanitimVM by viewModels<EnghizliokumatanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enghizliokumatanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EnghizliokumaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGHIZLIOKUMATANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnghizliokumatanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
