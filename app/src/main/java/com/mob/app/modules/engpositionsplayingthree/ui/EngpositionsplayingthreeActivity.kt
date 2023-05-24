package com.mob.app.modules.engpositionsplayingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityEngpositionsplayingthreeBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.engpositionsplayingfour.ui.EngpositionsplayingfourActivity
import com.mob.app.modules.engpositionsplayingthree.`data`.viewmodel.EngpositionsplayingthreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngpositionsplayingthreeActivity :
    BaseActivity<ActivityEngpositionsplayingthreeBinding>(R.layout.activity_engpositionsplayingthree)
    {
  private val viewModel: EngpositionsplayingthreeVM by viewModels<EngpositionsplayingthreeVM>()

  private val REQUEST_CODE_ENGPOSITIONSPLAYINGFOUR_ACTIVITY: Int = 678

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionsplayingthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackwork.setOnClickListener {
      val destIntent = EngpositionsplayingfourActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGPOSITIONSPLAYINGFOUR_ACTIVITY)
    }
    binding.frameStackbasketballthree.setOnClickListener {
      this@EngpositionsplayingthreeActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
      MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
        neutralButton {
        }
      }
    }
    binding.frameStackbasketballone.setOnClickListener {
      this@EngpositionsplayingthreeActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
      MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
        neutralButton {
        }
      }
    }
    binding.linearColumnbasketballfour.setOnClickListener {
      this@EngpositionsplayingthreeActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
      MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
        neutralButton {
        }
      }
    }
    binding.linearRowletscheck.setOnClickListener {
      Toast.makeText(this@EngpositionsplayingthreeActivity,MyApp.getInstance().getString(R.string.msg_you_need_to_se_an_op_be_co),Toast.LENGTH_LONG).show()
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSPLAYINGTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionsplayingthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
