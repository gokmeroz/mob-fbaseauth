package com.mob.app.modules.engcarpmanine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmanineBinding
import com.mob.app.modules.engcarpmanine.`data`.model.EngcarpmanineRowModel
import com.mob.app.modules.engcarpmanine.`data`.viewmodel.EngcarpmanineVM
import com.mob.app.modules.engcarpmaseven.ui.EngcarpmasevenActivity
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmanineActivity :
    BaseActivity<ActivityEngcarpmanineBinding>(R.layout.activity_engcarpmanine) {
  private val viewModel: EngcarpmanineVM by viewModels<EngcarpmanineVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 823

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engcarpmanineAdapter =
    EngcarpmanineAdapter(viewModel.engcarpmanineList.value?:mutableListOf())
    //binding.recyclerEngcarpmanine.adapter = engcarpmanineAdapter
    engcarpmanineAdapter.setOnItemClickListener(
    object : EngcarpmanineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngcarpmanineRowModel) {
        onClickRecyclerEngcarpmanine(view, position, item)
      }
    }
    )
    viewModel.engcarpmanineList.observe(this) {
      engcarpmanineAdapter.updateData(it)
    }
    binding.engcarpmanineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletscheck.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerEngcarpmanine(
    view: View,
    position: Int,
    item: EngcarpmanineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMANINE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmanineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
