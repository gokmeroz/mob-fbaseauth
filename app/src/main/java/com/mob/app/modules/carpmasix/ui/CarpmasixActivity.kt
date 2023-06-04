package com.mob.app.modules.carpmasix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmasixBinding
import com.mob.app.modules.carpmasix.`data`.model.Listrectangle2083RowModel
import com.mob.app.modules.carpmasix.`data`.model.Listrectangle2084RowModel
import com.mob.app.modules.carpmasix.`data`.viewmodel.CarpmasixVM
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.engcarpmaseven.ui.EngcarpmasevenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmasixActivity : BaseActivity<ActivityCarpmasixBinding>(R.layout.activity_carpmasix) {
  private val viewModel: CarpmasixVM by viewModels<CarpmasixVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 265

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle2073Adapter =
    Listrectangle2073Adapter(viewModel.listrectangle2073List.value?:mutableListOf())
   // binding.recyclerListrectangle2073.adapter = listrectangle2073Adapter
    listrectangle2073Adapter.setOnItemClickListener(
    object : Listrectangle2073Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2083RowModel) {
        onClickRecyclerListrectangle2073(view, position, item)
      }
    }
    )
    viewModel.listrectangle2073List.observe(this) {
      listrectangle2073Adapter.updateData(it)
    }
    val listrectangle2069Adapter =
    Listrectangle2069Adapter(viewModel.listrectangle2069List.value?:mutableListOf())
    //binding.recyclerListrectangle2069.adapter = listrectangle2069Adapter
    listrectangle2069Adapter.setOnItemClickListener(
    object : Listrectangle2069Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2084RowModel) {
        onClickRecyclerListrectangle2069(view, position, item)
      }
    }
    )
    viewModel.listrectangle2069List.observe(this) {
      listrectangle2069Adapter.updateData(it)
    }
    binding.carpmasixVM = viewModel
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
    item: Listrectangle2083RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle2069(
    view: View,
    position: Int,
    item: Listrectangle2084RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMASIX_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmasixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
