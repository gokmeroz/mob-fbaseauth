package com.mob.app.modules.engcarpmaseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmasevenBinding
import com.mob.app.modules.engcarpmaseven.`data`.model.EngcarpmasevenRowModel
import com.mob.app.modules.engcarpmaseven.`data`.viewmodel.EngcarpmasevenVM
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmasevenActivity :
    BaseActivity<ActivityEngcarpmasevenBinding>(R.layout.activity_engcarpmaseven) {
  private val viewModel: EngcarpmasevenVM by viewModels<EngcarpmasevenVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 517


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engcarpmasevenAdapter =
    EngcarpmasevenAdapter(viewModel.engcarpmasevenList.value?:mutableListOf())
    binding.recyclerEngcarpmaseven.adapter = engcarpmasevenAdapter
    engcarpmasevenAdapter.setOnItemClickListener(
    object : EngcarpmasevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngcarpmasevenRowModel) {
        onClickRecyclerEngcarpmaseven(view, position, item)
      }
    }
    )
    viewModel.engcarpmasevenList.observe(this) {
      engcarpmasevenAdapter.updateData(it)
    }
    binding.engcarpmasevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletscheck.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerEngcarpmaseven(
    view: View,
    position: Int,
    item: EngcarpmasevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMASEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmasevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
