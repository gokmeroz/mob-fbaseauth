package com.mob.app.modules.fall.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityFallBinding
import com.mob.app.modules.engseasonsecim.ui.EngseasonsecimActivity
import com.mob.app.modules.fall.`data`.viewmodel.FallVM
import kotlin.String
import kotlin.Unit

class FallActivity : BaseActivity<ActivityFallBinding>(R.layout.activity_fall) {
  private val viewModel: FallVM by viewModels<FallVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fallVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameFall.setOnClickListener {
      val destIntent = EngseasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FALL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FallActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
