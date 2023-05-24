package com.mob.app.modules.engsaattanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngsaattanitimBinding
import com.mob.app.modules.engsaattanitim.`data`.viewmodel.EngsaattanitimVM
import com.mob.app.modules.engsaatvideo.ui.EngsaatvideoActivity
import kotlin.String
import kotlin.Unit

class EngsaattanitimActivity :
    BaseActivity<ActivityEngsaattanitimBinding>(R.layout.activity_engsaattanitim) {
  private val viewModel: EngsaattanitimVM by viewModels<EngsaattanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engsaattanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearEngSaatTanitim.setOnClickListener {
      val destIntent = EngsaatvideoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSAATTANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngsaattanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
