package com.mob.app.modules.aylartanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityAylartanitimBinding
import com.mob.app.modules.aylartanitim.`data`.viewmodel.AylartanitimVM
import com.mob.app.modules.aylarvideo.ui.AylarvideoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AylartanitimActivity :
    BaseActivity<ActivityAylartanitimBinding>(R.layout.activity_aylartanitim) {
  private val viewModel: AylartanitimVM by viewModels<AylartanitimVM>()

  private val REQUEST_CODE_AYLARVIDEO_ACTIVITY: Int = 292

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aylartanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAylarTanitim.setOnClickListener {
      val destIntent = AylarvideoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_AYLARVIDEO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "AYLARTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AylartanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
