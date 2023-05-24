package com.mob.app.modules.engseasonsplaying.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngseasonsplayingBinding
import com.mob.app.modules.engseasonsplaying.`data`.viewmodel.EngseasonsplayingVM
import com.mob.app.modules.engseasonsplayingtwo.ui.EngseasonsplayingtwoActivity
import kotlin.String
import kotlin.Unit

class EngseasonsplayingActivity :
    BaseActivity<ActivityEngseasonsplayingBinding>(R.layout.activity_engseasonsplaying) {
  private val viewModel: EngseasonsplayingVM by viewModels<EngseasonsplayingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engseasonsplayingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearYard.setOnClickListener {
      val destIntent = EngseasonsplayingtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSEASONSPLAYING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngseasonsplayingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
