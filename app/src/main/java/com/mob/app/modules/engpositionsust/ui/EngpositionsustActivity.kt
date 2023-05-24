package com.mob.app.modules.engpositionsust.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngpositionsustBinding
import com.mob.app.modules.engpositionssag.ui.EngpositionssagActivity
import com.mob.app.modules.engpositionsust.`data`.viewmodel.EngpositionsustVM
import kotlin.String
import kotlin.Unit

class EngpositionsustActivity :
    BaseActivity<ActivityEngpositionsustBinding>(R.layout.activity_engpositionsust) {
  private val viewModel: EngpositionsustVM by viewModels<EngpositionsustVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionsustVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipse780.setOnClickListener {
      val destIntent = EngpositionssagActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSUST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionsustActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
