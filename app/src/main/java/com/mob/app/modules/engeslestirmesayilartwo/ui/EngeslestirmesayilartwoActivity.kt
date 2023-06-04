package com.mob.app.modules.engeslestirmesayilartwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmesayilartwoBinding
import com.mob.app.modules.engeslestirmehayvanlar.ui.EngeslestirmehayvanlarActivity
import com.mob.app.modules.engeslestirmesayilartwo.`data`.viewmodel.EngeslestirmesayilartwoVM
import kotlin.String
import kotlin.Unit

class EngeslestirmesayilartwoActivity :
    BaseActivity<ActivityEngeslestirmesayilartwoBinding>(R.layout.activity_engeslestirmesayilartwo)
    {
  private val viewModel: EngeslestirmesayilartwoVM by viewModels<EngeslestirmesayilartwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engeslestirmesayilartwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMESAYILARTWO_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmesayilartwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
