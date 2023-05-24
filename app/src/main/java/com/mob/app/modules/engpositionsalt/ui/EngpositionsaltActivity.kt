package com.mob.app.modules.engpositionsalt.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngpositionsaltBinding
import com.mob.app.modules.engpositionsalt.`data`.viewmodel.EngpositionsaltVM
import com.mob.app.modules.engpositionssol.ui.EngpositionssolActivity
import kotlin.String
import kotlin.Unit

class EngpositionsaltActivity :
    BaseActivity<ActivityEngpositionsaltBinding>(R.layout.activity_engpositionsalt) {
  private val viewModel: EngpositionsaltVM by viewModels<EngpositionsaltVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionsaltVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipse780.setOnClickListener {
      val destIntent = EngpositionssolActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSALT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionsaltActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
