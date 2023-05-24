package com.mob.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySplashscreenBinding
import com.mob.app.modules.dilsecim.ui.DilsecimActivity
import com.mob.app.modules.splashscreen.`data`.viewmodel.SplashscreenVM
import kotlin.String
import kotlin.Unit

class SplashscreenActivity :
    BaseActivity<ActivitySplashscreenBinding>(R.layout.activity_splashscreen) {
  private val viewModel: SplashscreenVM by viewModels<SplashscreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashscreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = DilsecimActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASHSCREEN_ACTIVITY"

    }
  }
