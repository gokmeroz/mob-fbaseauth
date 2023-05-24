package com.mob.app.modules.engcarpmakonuanlatim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmakonuanlatimBinding
import com.mob.app.modules.engcarpmakonuanlatim.`data`.model.ListapplethreeTwoRowModel
import com.mob.app.modules.engcarpmakonuanlatim.`data`.viewmodel.EngcarpmakonuanlatimVM
import com.mob.app.modules.engcarpmasecim.ui.EngcarpmasecimActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmakonuanlatimActivity :
    BaseActivity<ActivityEngcarpmakonuanlatimBinding>(R.layout.activity_engcarpmakonuanlatim) {
  private val viewModel: EngcarpmakonuanlatimVM by viewModels<EngcarpmakonuanlatimVM>()

  private val REQUEST_CODE_ENGCARPMASECIM_ACTIVITY: Int = 411


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listapplethreeTwoAdapter =
    ListapplethreeTwoAdapter(viewModel.listapplethreeTwoList.value?:mutableListOf())
    binding.recyclerListapplethreeTwo.adapter = listapplethreeTwoAdapter
    listapplethreeTwoAdapter.setOnItemClickListener(
    object : ListapplethreeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListapplethreeTwoRowModel) {
        onClickRecyclerListapplethreeTwo(view, position, item)
      }
    }
    )
    viewModel.listapplethreeTwoList.observe(this) {
      listapplethreeTwoAdapter.updateData(it)
    }
    binding.engcarpmakonuanlatimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletsreinforce.setOnClickListener {
      val destIntent = EngcarpmasecimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGCARPMASECIM_ACTIVITY)
    }
  }

  fun onClickRecyclerListapplethreeTwo(
    view: View,
    position: Int,
    item: ListapplethreeTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMAKONUANLATIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmakonuanlatimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
