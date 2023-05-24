package com.mob.app.modules.engaylarozet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngaylarozetBinding
import com.mob.app.modules.engaylaregzersiz.ui.EngaylaregzersizActivity
import com.mob.app.modules.engaylarozet.`data`.viewmodel.EngaylarozetVM
import kotlin.String
import kotlin.Unit

class EngaylarozetActivity :
    BaseActivity<ActivityEngaylarozetBinding>(R.layout.activity_engaylarozet) {
  private val viewModel: EngaylarozetVM by viewModels<EngaylarozetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engaylarozetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearUse.setOnClickListener {
      val destIntent = EngaylaregzersizActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGAYLAROZET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngaylarozetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
