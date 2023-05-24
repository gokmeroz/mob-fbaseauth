package com.mob.app.modules.engpositionssol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngpositionssolBinding
import com.mob.app.modules.engpositionson.ui.EngpositionsonActivity
import com.mob.app.modules.engpositionssol.`data`.viewmodel.EngpositionssolVM
import kotlin.String
import kotlin.Unit

class EngpositionssolActivity :
    BaseActivity<ActivityEngpositionssolBinding>(R.layout.activity_engpositionssol) {
  private val viewModel: EngpositionssolVM by viewModels<EngpositionssolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionssolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipse780.setOnClickListener {
      val destIntent = EngpositionsonActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSSOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionssolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
