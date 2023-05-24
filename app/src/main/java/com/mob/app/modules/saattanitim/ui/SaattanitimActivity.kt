package com.mob.app.modules.saattanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySaattanitimBinding
import com.mob.app.modules.saattanitim.`data`.viewmodel.SaattanitimVM
import com.mob.app.modules.saatvideo.ui.SaatvideoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SaattanitimActivity : BaseActivity<ActivitySaattanitimBinding>(R.layout.activity_saattanitim)
    {
  private val viewModel: SaattanitimVM by viewModels<SaattanitimVM>()

  private val REQUEST_CODE_SAATVIDEO_ACTIVITY: Int = 706

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.saattanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSaatTanitim.setOnClickListener {
      val destIntent = SaatvideoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAATVIDEO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SAATTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SaattanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
