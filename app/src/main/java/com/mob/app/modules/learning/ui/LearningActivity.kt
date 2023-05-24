package com.mob.app.modules.learning.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityLearningBinding
import com.mob.app.modules.engaylartanitim.ui.EngaylartanitimActivity
import com.mob.app.modules.engcarpmatanitim.ui.EngcarpmatanitimActivity
import com.mob.app.modules.enggunlertanitim.ui.EnggunlertanitimActivity
import com.mob.app.modules.enghizliokumatanitim.ui.EnghizliokumatanitimActivity
import com.mob.app.modules.engpositionstanitim.ui.EngpositionstanitimActivity
import com.mob.app.modules.engsaattanitim.ui.EngsaattanitimActivity
import com.mob.app.modules.engsayidizileritanitim.ui.EngsayidizileritanitimActivity
import com.mob.app.modules.engseasonstanitim.ui.EngseasonstanitimActivity
import com.mob.app.modules.engterssayitanitim.ui.EngterssayitanitimActivity
import com.mob.app.modules.learning.`data`.model.LearningRowModel
import com.mob.app.modules.learning.`data`.viewmodel.LearningVM
import com.mob.app.modules.playing.ui.PlayingActivity
import com.mob.app.modules.score.ui.ScoreActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LearningActivity : BaseActivity<ActivityLearningBinding>(R.layout.activity_learning) {
  private val viewModel: LearningVM by viewModels<LearningVM>()

  private val REQUEST_CODE_SCORE_ACTIVITY: Int = 976


  private val REQUEST_CODE_ENGCARPMATANITIM_ACTIVITY: Int = 267


  private val REQUEST_CODE_ENGGUNLERTANITIM_ACTIVITY: Int = 289


  private val REQUEST_CODE_ENGAYLARTANITIM_ACTIVITY: Int = 507


  private val REQUEST_CODE_ENGHIZLIOKUMATANITIM_ACTIVITY: Int = 333


  private val REQUEST_CODE_ENGSAATTANITIM_ACTIVITY: Int = 898


  private val REQUEST_CODE_ENGTERSSAYITANITIM_ACTIVITY: Int = 331


  private val REQUEST_CODE_ENGSAYIDIZILERITANITIM_ACTIVITY: Int = 279


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val learningAdapter = LearningAdapter(viewModel.learningList.value?:mutableListOf())
    //binding.recyclerLearning.adapter = learningAdapter
    learningAdapter.setOnItemClickListener(
    object : LearningAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LearningRowModel) {
        onClickRecyclerLearning(view, position, item)
      }
    }
    )
    viewModel.learningList.observe(this) {
      learningAdapter.updateData(it)
    }
    binding.learningVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.skorLearning.setOnClickListener {
      val destIntent = ScoreActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCORE_ACTIVITY)
    }
    binding.carpimLearning.setOnClickListener {
      val destIntent = EngcarpmatanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGCARPMATANITIM_ACTIVITY)
    }
    binding.seasonsLearning.setOnClickListener {
      val destIntent = EngseasonstanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.gunlerLearning.setOnClickListener {
      val destIntent = EnggunlertanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGGUNLERTANITIM_ACTIVITY)
    }
    binding.aylarLearning.setOnClickListener {
      val destIntent = EngaylartanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGAYLARTANITIM_ACTIVITY)
    }
    binding.yonlerLearning.setOnClickListener {
      val destIntent = EngpositionstanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.hizliOkumaLearning.setOnClickListener {
      val destIntent = EnghizliokumatanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGHIZLIOKUMATANITIM_ACTIVITY)
    }
    binding.analogLearning.setOnClickListener {
      val destIntent = EngsaattanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGSAATTANITIM_ACTIVITY)
    }
    binding.frameStacke.setOnClickListener {
      val destIntent = PlayingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.sayilarLearning.setOnClickListener {
      val destIntent = EngsayidizileritanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.tersSayiLearning.setOnClickListener {
      val destIntent = EngterssayitanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerLearning(
    view: View,
    position: Int,
    item: LearningRowModel
  ): Unit {
    when(view.id) {
      R.id.imageDigitL -> {
        onClickRecyclerLearningImageDigitL(view, position, item)
      }
    }
  }

  fun onClickRecyclerLearningImageDigitL(
    view: View,
    position: Int,
    item: LearningRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = EngterssayitanitimActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGTERSSAYITANITIM_ACTIVITY)
      }
      1 -> {
        val destIntent = EngsayidizileritanitimActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGSAYIDIZILERITANITIM_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "LEARNING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LearningActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
