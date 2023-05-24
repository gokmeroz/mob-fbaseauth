package com.mob.app.modules.positionsalt.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPositionsaltBinding
import com.mob.app.modules.positionsalt.`data`.viewmodel.PositionsaltVM
import com.mob.app.modules.positionssol.ui.PositionssolActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsaltActivity :
    BaseActivity<ActivityPositionsaltBinding>(R.layout.activity_positionsalt) {
  private val viewModel: PositionsaltVM by viewModels<PositionsaltVM>()

  private val REQUEST_CODE_POSITIONSSOL_ACTIVITY: Int = 676

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionsaltVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.framePositionsAlt.setOnClickListener {
      val destIntent = PositionssolActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSSOL_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "POSITIONSALT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsaltActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
