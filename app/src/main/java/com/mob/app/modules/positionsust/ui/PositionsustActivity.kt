package com.mob.app.modules.positionsust.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPositionsustBinding
import com.mob.app.modules.positionssag.ui.PositionssagActivity
import com.mob.app.modules.positionsust.`data`.viewmodel.PositionsustVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsustActivity :
    BaseActivity<ActivityPositionsustBinding>(R.layout.activity_positionsust) {
  private val viewModel: PositionsustVM by viewModels<PositionsustVM>()

  private val REQUEST_CODE_POSITIONSSAG_ACTIVITY: Int = 342


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionsustVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.framePositionsUst.setOnClickListener {
      val destIntent = PositionssagActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSSAG_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "POSITIONSUST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsustActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
