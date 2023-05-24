package com.mob.app.modules.engterssayitanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngterssayitanitimBinding
import com.mob.app.modules.engterssayi.ui.EngterssayiActivity
import com.mob.app.modules.engterssayitanitim.`data`.viewmodel.EngterssayitanitimVM
import kotlin.String
import kotlin.Unit

class EngterssayitanitimActivity :
    BaseActivity<ActivityEngterssayitanitimBinding>(R.layout.activity_engterssayitanitim) {
  private val viewModel: EngterssayitanitimVM by viewModels<EngterssayitanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engterssayitanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngterssayiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGTERSSAYITANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngterssayitanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
