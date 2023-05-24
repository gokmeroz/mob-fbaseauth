package com.mob.app.modules.eslestirmesayilar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmesayilarBinding
import com.mob.app.modules.eslestirmesayilar.`data`.model.Gridnumberblocksone3RowModel
import com.mob.app.modules.eslestirmesayilar.`data`.viewmodel.EslestirmesayilarVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EslestirmesayilarActivity :
    BaseActivity<ActivityEslestirmesayilarBinding>(R.layout.activity_eslestirmesayilar) {
  private val viewModel: EslestirmesayilarVM by viewModels<EslestirmesayilarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridnumberblocksoneAdapter =
    GridnumberblocksoneAdapter(viewModel.gridnumberblocksoneList.value?:mutableListOf())
    binding.recyclerGridnumberblocksone.adapter = gridnumberblocksoneAdapter
    gridnumberblocksoneAdapter.setOnItemClickListener(
    object : GridnumberblocksoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridnumberblocksone3RowModel) {
        onClickRecyclerGridnumberblocksone(view, position, item)
      }
    }
    )
    viewModel.gridnumberblocksoneList.observe(this) {
      gridnumberblocksoneAdapter.updateData(it)
    }
    binding.eslestirmesayilarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridnumberblocksone(
    view: View,
    position: Int,
    item: Gridnumberblocksone3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ESLESTIRMESAYILAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmesayilarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
