package com.mob.app.modules.engeslestirmehayvanlar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmehayvanlarBinding
import com.mob.app.modules.engeslestirmehayvanlar.`data`.model.GridlivestockoneRowModel
import com.mob.app.modules.engeslestirmehayvanlar.`data`.viewmodel.EngeslestirmehayvanlarVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngeslestirmehayvanlarActivity :
    BaseActivity<ActivityEngeslestirmehayvanlarBinding>(R.layout.activity_engeslestirmehayvanlar) {
  private val viewModel: EngeslestirmehayvanlarVM by viewModels<EngeslestirmehayvanlarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridlivestockoneAdapter =
    GridlivestockoneAdapter(viewModel.gridlivestockoneList.value?:mutableListOf())
  //  binding.recyclerGridlivestockone.adapter = gridlivestockoneAdapter
    gridlivestockoneAdapter.setOnItemClickListener(
    object : GridlivestockoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridlivestockoneRowModel) {
        onClickRecyclerGridlivestockone(view, position, item)
      }
    }
    )
    viewModel.gridlivestockoneList.observe(this) {
      gridlivestockoneAdapter.updateData(it)
    }
    binding.engeslestirmehayvanlarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridlivestockone(
    view: View,
    position: Int,
    item: GridlivestockoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMEHAYVANLAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmehayvanlarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
