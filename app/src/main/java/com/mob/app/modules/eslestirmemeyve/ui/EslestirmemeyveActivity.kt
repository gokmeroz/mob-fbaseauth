package com.mob.app.modules.eslestirmemeyve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmemeyveBinding
import com.mob.app.modules.eslestirmemeyve.`data`.model.Gridhealthyfoodone1RowModel
import com.mob.app.modules.eslestirmemeyve.`data`.viewmodel.EslestirmemeyveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EslestirmemeyveActivity :
    BaseActivity<ActivityEslestirmemeyveBinding>(R.layout.activity_eslestirmemeyve) {
  private val viewModel: EslestirmemeyveVM by viewModels<EslestirmemeyveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridhealthyfoodoneAdapter =
    GridhealthyfoodoneAdapter(viewModel.gridhealthyfoodoneList.value?:mutableListOf())
    binding.recyclerGridhealthyfoodone.adapter = gridhealthyfoodoneAdapter
    gridhealthyfoodoneAdapter.setOnItemClickListener(
    object : GridhealthyfoodoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridhealthyfoodone1RowModel) {
        onClickRecyclerGridhealthyfoodone(view, position, item)
      }
    }
    )
    viewModel.gridhealthyfoodoneList.observe(this) {
      gridhealthyfoodoneAdapter.updateData(it)
    }
    binding.eslestirmemeyveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridhealthyfoodone(
    view: View,
    position: Int,
    item: Gridhealthyfoodone1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ESLESTIRMEMEYVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmemeyveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
