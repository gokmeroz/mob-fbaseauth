package com.mob.app.modules.score.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityScoreBinding
import com.mob.app.modules.engskortablo.ui.EngskortabloActivity
import com.mob.app.modules.score.`data`.viewmodel.ScoreVM
import kotlin.String
import kotlin.Unit

class ScoreActivity : BaseActivity<ActivityScoreBinding>(R.layout.activity_score) {
  private val viewModel: ScoreVM by viewModels<ScoreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scoreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearScore.setOnClickListener {
      val destIntent = EngskortabloActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCORE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScoreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
