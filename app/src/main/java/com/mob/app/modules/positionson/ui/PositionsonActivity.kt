package com.mob.app.modules.positionson.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPositionsonBinding
import com.mob.app.modules.positionson.`data`.viewmodel.PositionsonVM
import com.mob.app.modules.positionsplaying.ui.PositionsplayingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsonActivity : BaseActivity<ActivityPositionsonBinding>(R.layout.activity_positionson)
    {
  private val viewModel: PositionsonVM by viewModels<PositionsonVM>()

  private val REQUEST_CODE_POSITIONSPLAYING_ACTIVITY: Int = 345


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionsonVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.framePositionsOn.setOnClickListener {
      val destIntent = PositionsplayingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSPLAYING_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "POSITIONSON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsonActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
