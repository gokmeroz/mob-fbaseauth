package com.mob.app.modules.engaylaregzersiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngaylaregzersizBinding
import com.mob.app.modules.engaylaregzersiz.`data`.viewmodel.EngaylaregzersizVM
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngaylaregzersizActivity :
    BaseActivity<ActivityEngaylaregzersizBinding>(R.layout.activity_engaylaregzersiz) {
  private val viewModel: EngaylaregzersizVM by viewModels<EngaylaregzersizVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 423


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engaylaregzersizVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearValue.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGAYLAREGZERSIZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngaylaregzersizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
