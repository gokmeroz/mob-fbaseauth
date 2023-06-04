package com.mob.app.modules.engcarpmaone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmaoneBinding
import com.mob.app.modules.engcarpmaone.`data`.model.Listrectangle2069RowModel
import com.mob.app.modules.engcarpmaone.`data`.model.Listrectangle2073RowModel
import com.mob.app.modules.engcarpmaone.`data`.viewmodel.EngcarpmaoneVM
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmaoneActivity :
    BaseActivity<ActivityEngcarpmaoneBinding>(R.layout.activity_engcarpmaone) {
  private val viewModel: EngcarpmaoneVM by viewModels<EngcarpmaoneVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 351


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle2073Adapter =
    Listrectangle2073Adapter(viewModel.listrectangle2073List.value?:mutableListOf())
    //binding.recyclerListrectangle2073.adapter = listrectangle2073Adapter
    listrectangle2073Adapter.setOnItemClickListener(
    object : Listrectangle2073Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2073RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listrectangle2069RowModel) {
        onClickRecyclerListrectangle2069(view, position, item)
      }
    }
    )
    viewModel.listrectangle2069List.observe(this) {
      listrectangle2069Adapter.updateData(it)
    }
    binding.engcarpmaoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletscheck.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerListrectangle2073(
    view: View,
    position: Int,
    item: Listrectangle2073RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle2069(
    view: View,
    position: Int,
    item: Listrectangle2069RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMAONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmaoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
