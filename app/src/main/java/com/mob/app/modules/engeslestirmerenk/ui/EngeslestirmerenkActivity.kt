package com.mob.app.modules.engeslestirmerenk.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmerenkBinding
import com.mob.app.modules.engeslestirmerenk.`data`.model.GridcolorpaletteoneRowModel
import com.mob.app.modules.engeslestirmerenk.`data`.viewmodel.EngeslestirmerenkVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngeslestirmerenkActivity :
    BaseActivity<ActivityEngeslestirmerenkBinding>(R.layout.activity_engeslestirmerenk) {
  private val viewModel: EngeslestirmerenkVM by viewModels<EngeslestirmerenkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridcolorpaletteoneAdapter =
    GridcolorpaletteoneAdapter(viewModel.gridcolorpaletteoneList.value?:mutableListOf())
    binding.recyclerGridcolorpaletteone.adapter = gridcolorpaletteoneAdapter
    gridcolorpaletteoneAdapter.setOnItemClickListener(
    object : GridcolorpaletteoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridcolorpaletteoneRowModel) {
        onClickRecyclerGridcolorpaletteone(view, position, item)
      }
    }
    )
    viewModel.gridcolorpaletteoneList.observe(this) {
      gridcolorpaletteoneAdapter.updateData(it)
    }
    binding.engeslestirmerenkVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridcolorpaletteone(
    view: View,
    position: Int,
    item: GridcolorpaletteoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMERENK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmerenkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
