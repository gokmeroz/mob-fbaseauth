package com.mob.app.modules.engpositionssag.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngpositionssagBinding
import com.mob.app.modules.engpositionsalt.ui.EngpositionsaltActivity
import com.mob.app.modules.engpositionssag.`data`.viewmodel.EngpositionssagVM
import kotlin.String
import kotlin.Unit

class EngpositionssagActivity :
    BaseActivity<ActivityEngpositionssagBinding>(R.layout.activity_engpositionssag) {
  private val viewModel: EngpositionssagVM by viewModels<EngpositionssagVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionssagVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipse780.setOnClickListener {
      val destIntent = EngpositionsaltActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSSAG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionssagActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
