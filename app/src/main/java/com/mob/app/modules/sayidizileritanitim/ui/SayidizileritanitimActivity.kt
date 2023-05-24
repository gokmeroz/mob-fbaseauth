package com.mob.app.modules.sayidizileritanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySayidizileritanitimBinding
import com.mob.app.modules.sayidizileri.ui.SayidizileriActivity
import com.mob.app.modules.sayidizileritanitim.`data`.viewmodel.SayidizileritanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SayidizileritanitimActivity :
    BaseActivity<ActivitySayidizileritanitimBinding>(R.layout.activity_sayidizileritanitim) {
  private val viewModel: SayidizileritanitimVM by viewModels<SayidizileritanitimVM>()

  private val REQUEST_CODE_SAYIDIZILERI_ACTIVITY: Int = 476


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sayidizileritanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnyy.setOnClickListener {
      val destIntent = SayidizileriActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAYIDIZILERI_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SAYIDIZILERITANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SayidizileritanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
