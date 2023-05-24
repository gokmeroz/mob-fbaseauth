package com.mob.app.modules.spring.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySpringBinding
import com.mob.app.modules.engseasonsecim.ui.EngseasonsecimActivity
import com.mob.app.modules.spring.`data`.viewmodel.SpringVM
import kotlin.String
import kotlin.Unit

class SpringActivity : BaseActivity<ActivitySpringBinding>(R.layout.activity_spring) {
  private val viewModel: SpringVM by viewModels<SpringVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.springVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameSpring.setOnClickListener {
      val destIntent = EngseasonsecimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPRING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpringActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
