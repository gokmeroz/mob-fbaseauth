package com.mob.app.modules.eslestirmehayvanlar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmehayvanlarBinding
import com.mob.app.modules.eslestirmehayvanlar.`data`.model.Gridlivestockone1RowModel
import com.mob.app.modules.eslestirmehayvanlar.`data`.viewmodel.EslestirmehayvanlarVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EslestirmehayvanlarActivity :
    BaseActivity<ActivityEslestirmehayvanlarBinding>(R.layout.activity_eslestirmehayvanlar) {
  private val viewModel: EslestirmehayvanlarVM by viewModels<EslestirmehayvanlarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridlivestockoneAdapter =
    GridlivestockoneAdapter(viewModel.gridlivestockoneList.value?:mutableListOf())
    binding.recyclerGridlivestockone.adapter = gridlivestockoneAdapter
    gridlivestockoneAdapter.setOnItemClickListener(
    object : GridlivestockoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridlivestockone1RowModel) {
        onClickRecyclerGridlivestockone(view, position, item)
      }
    }
    )
    viewModel.gridlivestockoneList.observe(this) {
      gridlivestockoneAdapter.updateData(it)
    }
    binding.eslestirmehayvanlarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridlivestockone(
    view: View,
    position: Int,
    item: Gridlivestockone1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ESLESTIRMEHAYVANLAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmehayvanlarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
