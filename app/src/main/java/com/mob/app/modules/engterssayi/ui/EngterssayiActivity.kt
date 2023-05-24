package com.mob.app.modules.engterssayi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngterssayiBinding
import com.mob.app.modules.engterssayi.`data`.viewmodel.EngterssayiVM
import kotlin.String
import kotlin.Unit

class EngterssayiActivity : BaseActivity<ActivityEngterssayiBinding>(R.layout.activity_engterssayi)
    {
  private val viewModel: EngterssayiVM by viewModels<EngterssayiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engterssayiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENGTERSSAYI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngterssayiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
