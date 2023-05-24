package com.mob.app.modules.kaydol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityKaydolBinding
import com.mob.app.modules.girisyap.ui.GirisyapActivity
import com.mob.app.modules.kaydol.`data`.viewmodel.KaydolVM
import com.mob.app.modules.tanitim.ui.TanitimActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KaydolActivity : BaseActivity<ActivityKaydolBinding>(R.layout.activity_kaydol) {
  private val viewModel: KaydolVM by viewModels<KaydolVM>()

  private val REQUEST_CODE_GIRISYAP_ACTIVITY: Int = 480


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kaydolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowdevam.setOnClickListener {
      val destIntent = TanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowgiriyap.setOnClickListener {
      val destIntent = GirisyapActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GIRISYAP_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "KAYDOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KaydolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
