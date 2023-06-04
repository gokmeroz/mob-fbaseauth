package com.mob.app.modules.carpmafour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmafourBinding
import com.mob.app.modules.carpmafour.`data`.model.Listrectangle2081RowModel
import com.mob.app.modules.carpmafour.`data`.model.Listrectangle2082RowModel
import com.mob.app.modules.carpmafour.`data`.viewmodel.CarpmafourVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmafourActivity : BaseActivity<ActivityCarpmafourBinding>(R.layout.activity_carpmafour) {
  private val viewModel: CarpmafourVM by viewModels<CarpmafourVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 430

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle2073Adapter =
    Listrectangle2073Adapter(viewModel.listrectangle2073List.value?:mutableListOf())
  //  binding.recyclerListrectangle2073.adapter = listrectangle2073Adapter
    listrectangle2073Adapter.setOnItemClickListener(
    object : Listrectangle2073Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2081RowModel) {
        onClickRecyclerListrectangle2073(view, position, item)
      }
    }
    )
    viewModel.listrectangle2073List.observe(this) {
      listrectangle2073Adapter.updateData(it)
    }
    val listrectangle2069Adapter =
    Listrectangle2069Adapter(viewModel.listrectangle2069List.value?:mutableListOf())
   // binding.recyclerListrectangle2069.adapter = listrectangle2069Adapter
    listrectangle2069Adapter.setOnItemClickListener(
    object : Listrectangle2069Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2082RowModel) {
        onClickRecyclerListrectangle2069(view, position, item)
      }
    }
    )
    viewModel.listrectangle2069List.observe(this) {
      listrectangle2069Adapter.updateData(it)
    }
    binding.carpmafourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerListrectangle2073(
    view: View,
    position: Int,
    item: Listrectangle2081RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle2069(
    view: View,
    position: Int,
    item: Listrectangle2082RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMAFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmafourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
