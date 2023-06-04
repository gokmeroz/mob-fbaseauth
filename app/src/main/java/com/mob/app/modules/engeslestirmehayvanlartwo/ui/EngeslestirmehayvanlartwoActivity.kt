package com.mob.app.modules.engeslestirmehayvanlartwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmehayvanlartwoBinding
import com.mob.app.modules.engeslestirmehayvanlar.ui.EngeslestirmehayvanlarActivity
import com.mob.app.modules.engeslestirmehayvanlartwo.`data`.viewmodel.EngeslestirmehayvanlartwoVM
import kotlin.String
import kotlin.Unit

class EngeslestirmehayvanlartwoActivity :
    BaseActivity<ActivityEngeslestirmehayvanlartwoBinding>(R.layout.activity_engeslestirmehayvanlartwo)
    {
  private val viewModel: EngeslestirmehayvanlartwoVM by viewModels<EngeslestirmehayvanlartwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engeslestirmehayvanlartwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMEHAYVANLARTWO_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmehayvanlartwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
