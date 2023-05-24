package com.mob.app.modules.dilsecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityDilsecimBinding
import com.mob.app.modules.dilsecim.`data`.viewmodel.DilsecimVM
import com.mob.app.modules.girisyap.ui.GirisyapActivity
import com.mob.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

class DilsecimActivity : BaseActivity<ActivityDilsecimBinding>(R.layout.activity_dilsecim) {
  private val viewModel: DilsecimVM by viewModels<DilsecimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dilsecimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUnitedkingdom.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageTurkeyOne.setOnClickListener {
      val destIntent = GirisyapActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DILSECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DilsecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
