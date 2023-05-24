package com.mob.app.modules.sonbahar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySonbaharBinding
import com.mob.app.modules.seasonsecim.ui.SeasonsecimActivity
import com.mob.app.modules.sonbahar.`data`.viewmodel.SonbaharVM
import kotlin.String
import kotlin.Unit

class SonbaharActivity : BaseActivity<ActivitySonbaharBinding>(R.layout.activity_sonbahar) {
  private val viewModel: SonbaharVM by viewModels<SonbaharVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sonbaharVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameSonbahar.setOnClickListener {
      val destIntent = SeasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SONBAHAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SonbaharActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
