package com.mob.app.modules.girisyap.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityGirisyapBinding
import com.mob.app.modules.girisyap.`data`.viewmodel.GirisyapVM
import com.mob.app.modules.kaydol.ui.KaydolActivity
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GirisyapActivity : BaseActivity<ActivityGirisyapBinding>(R.layout.activity_girisyap) {
  private val viewModel: GirisyapVM by viewModels<GirisyapVM>()

  private val REQUEST_CODE_KAYDOL_ACTIVITY: Int = 735

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.girisyapVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowgiriYap.setOnClickListener {
      val destIntent = KaydolActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_KAYDOL_ACTIVITY)
    }
    binding.linearRowgiriyap.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GIRISYAP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GirisyapActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
