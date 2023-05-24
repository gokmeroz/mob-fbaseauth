package com.mob.app.modules.engwrite.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngwriteBinding
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import com.mob.app.modules.engwrite.`data`.viewmodel.EngwriteVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngwriteActivity : BaseActivity<ActivityEngwriteBinding>(R.layout.activity_engwrite) {
  private val viewModel: EngwriteVM by viewModels<EngwriteVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 933


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engwriteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearWhite.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGWRITE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngwriteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
