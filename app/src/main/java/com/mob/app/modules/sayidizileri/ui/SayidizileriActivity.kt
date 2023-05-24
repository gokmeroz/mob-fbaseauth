package com.mob.app.modules.sayidizileri.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySayidizileriBinding
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.sayidizileri.`data`.viewmodel.SayidizileriVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SayidizileriActivity :
    BaseActivity<ActivitySayidizileriBinding>(R.layout.activity_sayidizileri) {
  private val viewModel: SayidizileriVM by viewModels<SayidizileriVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 447


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sayidizileriVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowdevam.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SAYIDIZILERI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SayidizileriActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
