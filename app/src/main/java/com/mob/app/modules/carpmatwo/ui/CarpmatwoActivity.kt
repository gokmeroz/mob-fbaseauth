package com.mob.app.modules.carpmatwo.ui

import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmatwoBinding
import com.mob.app.modules.carpmatwo.`data`.model.CarpmatwoRowModel
import com.mob.app.modules.carpmatwo.`data`.viewmodel.CarpmatwoVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmatwoActivity : BaseActivity<ActivityCarpmatwoBinding>(R.layout.activity_carpmatwo) {
  private val viewModel: CarpmatwoVM by viewModels<CarpmatwoVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 919

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carpmatwoAdapter = CarpmatwoAdapter(viewModel.carpmatwoList.value?:mutableListOf())
    binding.recyclerCarpmatwo.adapter = carpmatwoAdapter
    carpmatwoAdapter.setOnItemClickListener(
    object : CarpmatwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarpmatwoRowModel) {
        onClickRecyclerCarpmatwo(view, position, item)
      }
    }
    )
    viewModel.carpmatwoList.observe(this) {
      carpmatwoAdapter.updateData(it)
    }
    binding.carpmatwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerCarpmatwo(
    view: View,
    position: Int,
    item: CarpmatwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMATWO_ACTIVITY"

  }
}
