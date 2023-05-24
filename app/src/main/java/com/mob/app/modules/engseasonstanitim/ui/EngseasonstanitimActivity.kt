package com.mob.app.modules.engseasonstanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngseasonstanitimBinding
import com.mob.app.modules.engseasonsecim.ui.EngseasonsecimActivity
import com.mob.app.modules.engseasonstanitim.`data`.viewmodel.EngseasonstanitimVM
import kotlin.String
import kotlin.Unit

class EngseasonstanitimActivity :
    BaseActivity<ActivityEngseasonstanitimBinding>(R.layout.activity_engseasonstanitim) {
  private val viewModel: EngseasonstanitimVM by viewModels<EngseasonstanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engseasonstanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngseasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSEASONSTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngseasonstanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
