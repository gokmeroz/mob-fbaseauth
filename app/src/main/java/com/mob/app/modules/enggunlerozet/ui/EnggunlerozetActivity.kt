package com.mob.app.modules.enggunlerozet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnggunlerozetBinding
import com.mob.app.modules.enggunlerozet.`data`.model.EnggunlerozetRowModel
import com.mob.app.modules.enggunlerozet.`data`.viewmodel.EnggunlerozetVM
import com.mob.app.modules.learning.ui.LearningActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EnggunlerozetActivity :
    BaseActivity<ActivityEnggunlerozetBinding>(R.layout.activity_enggunlerozet) {
  private val viewModel: EnggunlerozetVM by viewModels<EnggunlerozetVM>()

  private val REQUEST_CODE_LEARNING_ACTIVITY: Int = 821


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val enggunlerozetAdapter =
    EnggunlerozetAdapter(viewModel.enggunlerozetList.value?:mutableListOf())
   // binding.recyclerEnggunlerozet.adapter = enggunlerozetAdapter
    enggunlerozetAdapter.setOnItemClickListener(
    object : EnggunlerozetAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EnggunlerozetRowModel) {
        onClickRecyclerEnggunlerozet(view, position, item)
      }
    }
    )
    viewModel.enggunlerozetList.observe(this) {
      enggunlerozetAdapter.updateData(it)
    }
    binding.enggunlerozetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameEngGunlerOzet.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEARNING_ACTIVITY)
    }
  }

  fun onClickRecyclerEnggunlerozet(
    view: View,
    position: Int,
    item: EnggunlerozetRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGGUNLEROZET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnggunlerozetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
