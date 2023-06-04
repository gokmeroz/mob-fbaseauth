package com.mob.app.modules.carpmathree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmathreeBinding
import com.mob.app.modules.carpmathree.`data`.model.CarpmathreeRowModel
import com.mob.app.modules.carpmathree.`data`.viewmodel.CarpmathreeVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.engcarpmaseven.ui.EngcarpmasevenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmathreeActivity : BaseActivity<ActivityCarpmathreeBinding>(R.layout.activity_carpmathree)
    {
  private val viewModel: CarpmathreeVM by viewModels<CarpmathreeVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 986

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carpmathreeAdapter =
    CarpmathreeAdapter(viewModel.carpmathreeList.value?:mutableListOf())
    //binding.recyclerCarpmathree.adapter = carpmathreeAdapter
    carpmathreeAdapter.setOnItemClickListener(
    object : CarpmathreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarpmathreeRowModel) {
        onClickRecyclerCarpmathree(view, position, item)
      }
    }
    )
    viewModel.carpmathreeList.observe(this) {
      carpmathreeAdapter.updateData(it)
    }
    binding.carpmathreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerCarpmathree(
    view: View,
    position: Int,
    item: CarpmathreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMATHREE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmathreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
