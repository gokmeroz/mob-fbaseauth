package com.mob.app.modules.carpmaseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmasevenBinding
import com.mob.app.modules.carpmaseven.`data`.model.CarpmasevenRowModel
import com.mob.app.modules.carpmaseven.`data`.viewmodel.CarpmasevenVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmasevenActivity : BaseActivity<ActivityCarpmasevenBinding>(R.layout.activity_carpmaseven)
    {
  private val viewModel: CarpmasevenVM by viewModels<CarpmasevenVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 185

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carpmasevenAdapter =
    CarpmasevenAdapter(viewModel.carpmasevenList.value?:mutableListOf())
  //  binding.recyclerCarpmaseven.adapter = carpmasevenAdapter
    carpmasevenAdapter.setOnItemClickListener(
    object : CarpmasevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarpmasevenRowModel) {
        onClickRecyclerCarpmaseven(view, position, item)
      }
    }
    )
    viewModel.carpmasevenList.observe(this) {
      carpmasevenAdapter.updateData(it)
    }
    binding.carpmasevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerCarpmaseven(
    view: View,
    position: Int,
    item: CarpmasevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMASEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmasevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
