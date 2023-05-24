package com.mob.app.modules.terssayitanitim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityTerssayitanitimBinding
import com.mob.app.modules.terssayi.ui.TerssayiActivity
import com.mob.app.modules.terssayitanitim.`data`.viewmodel.TerssayitanitimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TerssayitanitimActivity :
    BaseActivity<ActivityTerssayitanitimBinding>(R.layout.activity_terssayitanitim) {
  private val viewModel: TerssayitanitimVM by viewModels<TerssayitanitimVM>()

  private val REQUEST_CODE_TERSSAYI_ACTIVITY: Int = 760

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.terssayitanitimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipse779.setOnClickListener {
      val destIntent = TerssayiActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TERSSAYI_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "TERSSAYITANITIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TerssayitanitimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
