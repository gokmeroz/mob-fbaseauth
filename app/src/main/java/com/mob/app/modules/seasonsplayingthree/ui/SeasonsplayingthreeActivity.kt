package com.mob.app.modules.seasonsplayingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonsplayingthreeBinding
import com.mob.app.modules.seasonsplayingfour.ui.SeasonsplayingfourActivity
import com.mob.app.modules.seasonsplayingthree.`data`.viewmodel.SeasonsplayingthreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeasonsplayingthreeActivity :
    BaseActivity<ActivitySeasonsplayingthreeBinding>(R.layout.activity_seasonsplayingthree) {
  private val viewModel: SeasonsplayingthreeVM by viewModels<SeasonsplayingthreeVM>()

  private val REQUEST_CODE_SEASONSPLAYINGFOUR_ACTIVITY: Int = 950


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seasonsplayingthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = SeasonsplayingfourActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SEASONSPLAYINGFOUR_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SEASONSPLAYINGTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonsplayingthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
