package com.mob.app.modules.engeslestirmesayilar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmesayilarBinding
import com.mob.app.modules.engeslestirmesayilar.`data`.model.Gridnumberblocksone1RowModel
import com.mob.app.modules.engeslestirmesayilar.`data`.viewmodel.EngeslestirmesayilarVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngeslestirmesayilarActivity :
    BaseActivity<ActivityEngeslestirmesayilarBinding>(R.layout.activity_engeslestirmesayilar) {
  private val viewModel: EngeslestirmesayilarVM by viewModels<EngeslestirmesayilarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridnumberblocksoneAdapter =
    GridnumberblocksoneAdapter(viewModel.gridnumberblocksoneList.value?:mutableListOf())
   // binding.recyclerGridnumberblocksone.adapter = gridnumberblocksoneAdapter
    gridnumberblocksoneAdapter.setOnItemClickListener(
    object : GridnumberblocksoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridnumberblocksone1RowModel) {
        onClickRecyclerGridnumberblocksone(view, position, item)
      }
    }
    )
    viewModel.gridnumberblocksoneList.observe(this) {
      gridnumberblocksoneAdapter.updateData(it)
    }
    binding.engeslestirmesayilarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridnumberblocksone(
    view: View,
    position: Int,
    item: Gridnumberblocksone1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMESAYILAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmesayilarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
