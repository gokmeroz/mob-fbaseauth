package com.mob.app.modules.carpmanine.ui

import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmanineBinding
import com.mob.app.modules.carpmanine.`data`.model.CarpmanineRowModel
import com.mob.app.modules.carpmanine.`data`.viewmodel.CarpmanineVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmanineActivity : BaseActivity<ActivityCarpmanineBinding>(R.layout.activity_carpmanine) {
  private val viewModel: CarpmanineVM by viewModels<CarpmanineVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 248

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carpmanineAdapter = CarpmanineAdapter(viewModel.carpmanineList.value?:mutableListOf())
    binding.recyclerCarpmanine.adapter = carpmanineAdapter
    carpmanineAdapter.setOnItemClickListener(
    object : CarpmanineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarpmanineRowModel) {
        onClickRecyclerCarpmanine(view, position, item)
      }
    }
    )
    viewModel.carpmanineList.observe(this) {
      carpmanineAdapter.updateData(it)
    }
    binding.carpmanineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerCarpmanine(
    view: View,
    position: Int,
    item: CarpmanineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMANINE_ACTIVITY"

  }
}
