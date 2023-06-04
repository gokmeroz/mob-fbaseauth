package com.mob.app.modules.engeslestirmemeyve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmemeyveBinding
import com.mob.app.modules.engeslestirmemeyve.`data`.model.GridhealthyfoodoneRowModel
import com.mob.app.modules.engeslestirmemeyve.`data`.viewmodel.EngeslestirmemeyveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngeslestirmemeyveActivity :
    BaseActivity<ActivityEngeslestirmemeyveBinding>(R.layout.activity_engeslestirmemeyve) {
  private val viewModel: EngeslestirmemeyveVM by viewModels<EngeslestirmemeyveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridhealthyfoodoneAdapter =
    GridhealthyfoodoneAdapter(viewModel.gridhealthyfoodoneList.value?:mutableListOf())
    //binding.recyclerGridhealthyfoodone.adapter = gridhealthyfoodoneAdapter
    gridhealthyfoodoneAdapter.setOnItemClickListener(
    object : GridhealthyfoodoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridhealthyfoodoneRowModel) {
        onClickRecyclerGridhealthyfoodone(view, position, item)
      }
    }
    )
    viewModel.gridhealthyfoodoneList.observe(this) {
      gridhealthyfoodoneAdapter.updateData(it)
    }
    binding.engeslestirmemeyveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridhealthyfoodone(
    view: View,
    position: Int,
    item: GridhealthyfoodoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMEMEYVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmemeyveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
