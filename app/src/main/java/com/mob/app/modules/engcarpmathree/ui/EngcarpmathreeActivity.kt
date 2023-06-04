package com.mob.app.modules.engcarpmathree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmathreeBinding
import com.mob.app.modules.engcarpmaseven.ui.EngcarpmasevenActivity
import com.mob.app.modules.engcarpmathree.`data`.model.EngcarpmathreeRowModel
import com.mob.app.modules.engcarpmathree.`data`.viewmodel.EngcarpmathreeVM
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmathreeActivity :
    BaseActivity<ActivityEngcarpmathreeBinding>(R.layout.activity_engcarpmathree) {
  private val viewModel: EngcarpmathreeVM by viewModels<EngcarpmathreeVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 305

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engcarpmathreeAdapter =
    EngcarpmathreeAdapter(viewModel.engcarpmathreeList.value?:mutableListOf())
   // binding.recyclerEngcarpmathree.adapter = engcarpmathreeAdapter
    engcarpmathreeAdapter.setOnItemClickListener(
    object : EngcarpmathreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngcarpmathreeRowModel) {
        onClickRecyclerEngcarpmathree(view, position, item)
      }
    }
    )
    viewModel.engcarpmathreeList.observe(this) {
      engcarpmathreeAdapter.updateData(it)
    }
    binding.engcarpmathreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletscheck.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerEngcarpmathree(
    view: View,
    position: Int,
    item: EngcarpmathreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMATHREE_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmathreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
