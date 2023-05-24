package com.mob.app.modules.engseasonsplayingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngseasonsplayingthreeBinding
import com.mob.app.modules.engseasonsplayingfour.ui.EngseasonsplayingfourActivity
import com.mob.app.modules.engseasonsplayingthree.`data`.viewmodel.EngseasonsplayingthreeVM
import kotlin.String
import kotlin.Unit

class EngseasonsplayingthreeActivity :
    BaseActivity<ActivityEngseasonsplayingthreeBinding>(R.layout.activity_engseasonsplayingthree) {
  private val viewModel: EngseasonsplayingthreeVM by viewModels<EngseasonsplayingthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engseasonsplayingthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearYou.setOnClickListener {
      val destIntent = EngseasonsplayingfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGSEASONSPLAYINGTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngseasonsplayingthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
