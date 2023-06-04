package com.mob.app.modules.eslestirmesayilartwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmesayilartwoBinding
import com.mob.app.modules.eslestirmerenk.ui.EslestirmerenkActivity
import com.mob.app.modules.eslestirmesayilartwo.`data`.viewmodel.EslestirmesayilartwoVM
import kotlin.String
import kotlin.Unit

class EslestirmesayilartwoActivity :
    BaseActivity<ActivityEslestirmesayilartwoBinding>(R.layout.activity_eslestirmesayilartwo) {
  private val viewModel: EslestirmesayilartwoVM by viewModels<EslestirmesayilartwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eslestirmesayilartwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ESLESTIRMESAYILARTWO_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmesayilartwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
