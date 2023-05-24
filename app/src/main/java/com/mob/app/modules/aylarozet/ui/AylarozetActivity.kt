package com.mob.app.modules.aylarozet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityAylarozetBinding
import com.mob.app.modules.aylaregzersiz.ui.AylaregzersizActivity
import com.mob.app.modules.aylarozet.`data`.viewmodel.AylarozetVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AylarozetActivity : BaseActivity<ActivityAylarozetBinding>(R.layout.activity_aylarozet) {
  private val viewModel: AylarozetVM by viewModels<AylarozetVM>()

  private val REQUEST_CODE_AYLAREGZERSIZ_ACTIVITY: Int = 530


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aylarozetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowhadirendikle.setOnClickListener {
      val destIntent = AylaregzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_AYLAREGZERSIZ_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "AYLAROZET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AylarozetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
