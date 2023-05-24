package com.mob.app.modules.engseasonsplayingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngseasonsplayingtwoBinding
import com.mob.app.modules.engseasonsplayingthree.ui.EngseasonsplayingthreeActivity
import com.mob.app.modules.engseasonsplayingtwo.`data`.viewmodel.EngseasonsplayingtwoVM
import kotlin.String
import kotlin.Unit

class EngseasonsplayingtwoActivity :
    BaseActivity<ActivityEngseasonsplayingtwoBinding>(R.layout.activity_engseasonsplayingtwo) {
  private val viewModel: EngseasonsplayingtwoVM by viewModels<EngseasonsplayingtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engseasonsplayingtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearYour.setOnClickListener {
      val destIntent = EngseasonsplayingthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSEASONSPLAYINGTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngseasonsplayingtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
