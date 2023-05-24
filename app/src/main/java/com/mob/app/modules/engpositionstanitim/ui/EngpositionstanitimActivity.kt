package com.mob.app.modules.engpositionstanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngpositionstanitimBinding
import com.mob.app.modules.engpositionstanitim.`data`.viewmodel.EngpositionstanitimVM
import com.mob.app.modules.engpositionsust.ui.EngpositionsustActivity
import kotlin.String
import kotlin.Unit

class EngpositionstanitimActivity :
    BaseActivity<ActivityEngpositionstanitimBinding>(R.layout.activity_engpositionstanitim) {
  private val viewModel: EngpositionstanitimVM by viewModels<EngpositionstanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionstanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngpositionsustActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionstanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
