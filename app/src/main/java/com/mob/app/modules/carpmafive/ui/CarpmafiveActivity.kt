package com.mob.app.modules.carpmafive.ui

import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmafiveBinding
import com.mob.app.modules.carpmafive.`data`.model.CarpmafiveRowModel
import com.mob.app.modules.carpmafive.`data`.viewmodel.CarpmafiveVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmafiveActivity : BaseActivity<ActivityCarpmafiveBinding>(R.layout.activity_carpmafive) {
  private val viewModel: CarpmafiveVM by viewModels<CarpmafiveVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 610

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carpmafiveAdapter = CarpmafiveAdapter(viewModel.carpmafiveList.value?:mutableListOf())
    binding.recyclerCarpmafive.adapter = carpmafiveAdapter
    carpmafiveAdapter.setOnItemClickListener(
    object : CarpmafiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarpmafiveRowModel) {
        onClickRecyclerCarpmafive(view, position, item)
      }
    }
    )
    viewModel.carpmafiveList.observe(this) {
      carpmafiveAdapter.updateData(it)
    }
    binding.carpmafiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerCarpmafive(
    view: View,
    position: Int,
    item: CarpmafiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMAFIVE_ACTIVITY"

  }
}
