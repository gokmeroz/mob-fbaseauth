package com.mob.app.modules.seasonstanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonstanitimBinding
import com.mob.app.modules.seasonsecim.ui.SeasonsecimActivity
import com.mob.app.modules.seasonstanitim.`data`.viewmodel.SeasonstanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeasonstanitimActivity :
    BaseActivity<ActivitySeasonstanitimBinding>(R.layout.activity_seasonstanitim) {
  private val viewModel: SeasonstanitimVM by viewModels<SeasonstanitimVM>()

  private val REQUEST_CODE_SEASONSECIM_ACTIVITY: Int = 613

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seasonstanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSeasonsTanitim.setOnClickListener {
      val destIntent = SeasonsecimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SEASONSECIM_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SEASONSTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonstanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
