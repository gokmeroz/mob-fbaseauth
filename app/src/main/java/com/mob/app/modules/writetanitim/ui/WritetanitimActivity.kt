package com.mob.app.modules.writetanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityWritetanitimBinding
import com.mob.app.modules.sayidizileritanitim.ui.SayidizileritanitimActivity
import com.mob.app.modules.write.ui.WriteActivity
import com.mob.app.modules.writetanitim.`data`.viewmodel.WritetanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WritetanitimActivity :
    BaseActivity<ActivityWritetanitimBinding>(R.layout.activity_writetanitim) {
  private val viewModel: WritetanitimVM by viewModels<WritetanitimVM>()

  private val REQUEST_CODE_WRITE_ACTIVITY: Int = 796

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.writetanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearWriteTanitim.setOnClickListener {
      val destIntent = WriteActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  companion object {
    const val TAG: String = "WRITETANITIM_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WritetanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

  }
}
