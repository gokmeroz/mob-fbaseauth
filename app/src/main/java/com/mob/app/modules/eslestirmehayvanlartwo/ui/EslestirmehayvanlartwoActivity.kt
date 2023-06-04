package com.mob.app.modules.eslestirmehayvanlartwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmehayvanlartwoBinding
import com.mob.app.modules.eslestirmehayvanlartwo.`data`.viewmodel.EslestirmehayvanlartwoVM
import com.mob.app.modules.eslestirmerenk.ui.EslestirmerenkActivity
import kotlin.String
import kotlin.Unit

class EslestirmehayvanlartwoActivity :
    BaseActivity<ActivityEslestirmehayvanlartwoBinding>(R.layout.activity_eslestirmehayvanlartwo) {
  private val viewModel: EslestirmehayvanlartwoVM by viewModels<EslestirmehayvanlartwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eslestirmehayvanlartwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ESLESTIRMEHAYVANLARTWO_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmehayvanlartwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
