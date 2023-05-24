package com.mob.app.modules.engcarpmatwo.ui

import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmatwoBinding
import com.mob.app.modules.engcarpmatwo.`data`.model.EngcarpmatwoRowModel
import com.mob.app.modules.engcarpmatwo.`data`.viewmodel.EngcarpmatwoVM
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmatwoActivity :
    BaseActivity<ActivityEngcarpmatwoBinding>(R.layout.activity_engcarpmatwo) {
  private val viewModel: EngcarpmatwoVM by viewModels<EngcarpmatwoVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 214

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engcarpmatwoAdapter =
    EngcarpmatwoAdapter(viewModel.engcarpmatwoList.value?:mutableListOf())
    binding.recyclerEngcarpmatwo.adapter = engcarpmatwoAdapter
    engcarpmatwoAdapter.setOnItemClickListener(
    object : EngcarpmatwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngcarpmatwoRowModel) {
        onClickRecyclerEngcarpmatwo(view, position, item)
      }
    }
    )
    viewModel.engcarpmatwoList.observe(this) {
      engcarpmatwoAdapter.updateData(it)
    }
    binding.engcarpmatwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletscheck.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerEngcarpmatwo(
    view: View,
    position: Int,
    item: EngcarpmatwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMATWO_ACTIVITY"

  }
}
