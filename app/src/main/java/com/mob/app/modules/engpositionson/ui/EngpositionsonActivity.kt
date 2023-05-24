package com.mob.app.modules.engpositionson.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngpositionsonBinding
import com.mob.app.modules.engpositionson.`data`.viewmodel.EngpositionsonVM
import com.mob.app.modules.learning.ui.LearningActivity
import kotlin.String
import kotlin.Unit

class EngpositionsonActivity :
    BaseActivity<ActivityEngpositionsonBinding>(R.layout.activity_engpositionson) {
  private val viewModel: EngpositionsonVM by viewModels<EngpositionsonVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engpositionsonVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameEngPositionsOn.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionsonActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
