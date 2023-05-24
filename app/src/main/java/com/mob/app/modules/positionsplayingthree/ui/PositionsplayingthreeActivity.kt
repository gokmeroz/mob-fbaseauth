package com.mob.app.modules.positionsplayingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityPositionsplayingthreeBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.positionsplayingfour.ui.PositionsplayingfourActivity
import com.mob.app.modules.positionsplayingthree.`data`.viewmodel.PositionsplayingthreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsplayingthreeActivity :
    BaseActivity<ActivityPositionsplayingthreeBinding>(R.layout.activity_positionsplayingthree) {
  private val viewModel: PositionsplayingthreeVM by viewModels<PositionsplayingthreeVM>()

  private val REQUEST_CODE_POSITIONSPLAYINGFOUR_ACTIVITY: Int = 218

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.positionsplayingthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackgroupfiftyfive.setOnClickListener {
      val destIntent = PositionsplayingfourActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_POSITIONSPLAYINGFOUR_ACTIVITY)
    }
    binding.frameStackbasketballthree.setOnClickListener {
      this@PositionsplayingthreeActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
      MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
        neutralButton {
        }
      }
    }
    binding.linearRowkontroledelim.setOnClickListener {
      Toast.makeText(this@PositionsplayingthreeActivity,MyApp.getInstance().getString(R.string.msg_devam_etmek_i_in_bir_se_i),Toast.LENGTH_LONG).show()
    }
    binding.linearColumnbasketballfour.setOnClickListener {
      this@PositionsplayingthreeActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
      MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
        neutralButton {
        }
      }
    }
    binding.frameStackbasketballone.setOnClickListener {
      this@PositionsplayingthreeActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
      MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
        neutralButton {
        }
      }
    }
  }

  companion object {
    const val TAG: String = "POSITIONSPLAYINGTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsplayingthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
