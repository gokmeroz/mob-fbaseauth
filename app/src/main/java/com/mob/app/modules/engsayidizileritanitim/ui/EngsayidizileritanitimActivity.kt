package com.mob.app.modules.engsayidizileritanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngsayidizileritanitimBinding
import com.mob.app.modules.engsayidizileri.ui.EngsayidizileriActivity
import com.mob.app.modules.engsayidizileritanitim.`data`.viewmodel.EngsayidizileritanitimVM
import kotlin.String
import kotlin.Unit

class EngsayidizileritanitimActivity :
    BaseActivity<ActivityEngsayidizileritanitimBinding>(R.layout.activity_engsayidizileritanitim) {
  private val viewModel: EngsayidizileritanitimVM by viewModels<EngsayidizileritanitimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engsayidizileritanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = EngsayidizileriActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSAYIDIZILERITANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngsayidizileritanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
