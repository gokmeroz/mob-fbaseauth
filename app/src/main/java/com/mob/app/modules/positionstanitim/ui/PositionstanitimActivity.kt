package com.mob.app.modules.positionstanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPositionstanitimBinding
import com.mob.app.modules.positionstanitim.`data`.viewmodel.PositionstanitimVM
import com.mob.app.modules.positionsust.ui.PositionsustActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionstanitimActivity :
    BaseActivity<ActivityPositionstanitimBinding>(R.layout.activity_positionstanitim) {
  private val viewModel: PositionstanitimVM by viewModels<PositionstanitimVM>()

  private val REQUEST_CODE_POSITIONSUST_ACTIVITY: Int = 754

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionstanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnbb.setOnClickListener {
      val destIntent = PositionsustActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSUST_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "POSITIONSTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionstanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
