package com.mob.app.modules.ilkbahar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityIlkbaharBinding
import com.mob.app.modules.ilkbahar.`data`.viewmodel.IlkbaharVM
import com.mob.app.modules.seasonsecim.ui.SeasonsecimActivity
import kotlin.String
import kotlin.Unit

class IlkbaharActivity : BaseActivity<ActivityIlkbaharBinding>(R.layout.activity_ilkbahar) {
  private val viewModel: IlkbaharVM by viewModels<IlkbaharVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ilkbaharVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameIlkbahar.setOnClickListener {
      val destIntent = SeasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ILKBAHAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IlkbaharActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
