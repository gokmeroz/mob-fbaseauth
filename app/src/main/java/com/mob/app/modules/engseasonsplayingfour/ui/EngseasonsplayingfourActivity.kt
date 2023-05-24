package com.mob.app.modules.engseasonsplayingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngseasonsplayingfourBinding
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import com.mob.app.modules.engseasonsplayingfour.`data`.viewmodel.EngseasonsplayingfourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngseasonsplayingfourActivity :
    BaseActivity<ActivityEngseasonsplayingfourBinding>(R.layout.activity_engseasonsplayingfour) {
  private val viewModel: EngseasonsplayingfourVM by viewModels<EngseasonsplayingfourVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 181

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engseasonsplayingfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearYear.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGSEASONSPLAYINGFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngseasonsplayingfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
