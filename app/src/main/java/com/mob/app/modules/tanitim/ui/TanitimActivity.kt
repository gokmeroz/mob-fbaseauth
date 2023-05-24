package com.mob.app.modules.tanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityTanitimBinding
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import com.mob.app.modules.tanitim.`data`.viewmodel.TanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TanitimActivity : BaseActivity<ActivityTanitimBinding>(R.layout.activity_tanitim) {
  private val viewModel: TanitimVM by viewModels<TanitimVM>()

  private val REQUEST_CODE_OGRENME_ACTIVITY: Int = 963

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearTanitim.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OGRENME_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "TANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
