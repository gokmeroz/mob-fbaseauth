package com.mob.app.modules.engcarpmafive.ui

import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmafiveBinding
import com.mob.app.modules.engcarpmafive.`data`.model.EngcarpmafiveRowModel
import com.mob.app.modules.engcarpmafive.`data`.viewmodel.EngcarpmafiveVM
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmafiveActivity :
    BaseActivity<ActivityEngcarpmafiveBinding>(R.layout.activity_engcarpmafive) {
  private val viewModel: EngcarpmafiveVM by viewModels<EngcarpmafiveVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 228

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engcarpmafiveAdapter =
    EngcarpmafiveAdapter(viewModel.engcarpmafiveList.value?:mutableListOf())
    binding.recyclerEngcarpmafive.adapter = engcarpmafiveAdapter
    engcarpmafiveAdapter.setOnItemClickListener(
    object : EngcarpmafiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngcarpmafiveRowModel) {
        onClickRecyclerEngcarpmafive(view, position, item)
      }
    }
    )
    viewModel.engcarpmafiveList.observe(this) {
      engcarpmafiveAdapter.updateData(it)
    }
    binding.engcarpmafiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletscheck.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerEngcarpmafive(
    view: View,
    position: Int,
    item: EngcarpmafiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMAFIVE_ACTIVITY"

  }
}
