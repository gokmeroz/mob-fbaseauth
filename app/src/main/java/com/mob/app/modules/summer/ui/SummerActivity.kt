package com.mob.app.modules.summer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySummerBinding
import com.mob.app.modules.engseasonsecim.ui.EngseasonsecimActivity
import com.mob.app.modules.summer.`data`.viewmodel.SummerVM
import kotlin.String
import kotlin.Unit

class SummerActivity : BaseActivity<ActivitySummerBinding>(R.layout.activity_summer) {
  private val viewModel: SummerVM by viewModels<SummerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.summerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameSummer.setOnClickListener {
      val destIntent = EngseasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUMMER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SummerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
