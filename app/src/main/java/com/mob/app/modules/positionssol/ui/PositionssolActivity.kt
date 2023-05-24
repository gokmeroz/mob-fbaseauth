package com.mob.app.modules.positionssol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPositionssolBinding
import com.mob.app.modules.positionson.ui.PositionsonActivity
import com.mob.app.modules.positionssol.`data`.viewmodel.PositionssolVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionssolActivity :
    BaseActivity<ActivityPositionssolBinding>(R.layout.activity_positionssol) {
  private val viewModel: PositionssolVM by viewModels<PositionssolVM>()

  private val REQUEST_CODE_POSITIONSON_ACTIVITY: Int = 706

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionssolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.framePositionsSol.setOnClickListener {
      val destIntent = PositionsonActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSON_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "POSITIONSSOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionssolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
