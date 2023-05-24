package com.mob.app.modules.positionssag.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPositionssagBinding
import com.mob.app.modules.positionsalt.ui.PositionsaltActivity
import com.mob.app.modules.positionssag.`data`.viewmodel.PositionssagVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionssagActivity :
    BaseActivity<ActivityPositionssagBinding>(R.layout.activity_positionssag) {
  private val viewModel: PositionssagVM by viewModels<PositionssagVM>()

  private val REQUEST_CODE_POSITIONSALT_ACTIVITY: Int = 261


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionssagVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.framePositionsSag.setOnClickListener {
      val destIntent = PositionsaltActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSALT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "POSITIONSSAG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionssagActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
