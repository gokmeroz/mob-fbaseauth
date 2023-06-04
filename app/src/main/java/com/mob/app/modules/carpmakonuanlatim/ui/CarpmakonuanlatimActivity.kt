package com.mob.app.modules.carpmakonuanlatim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmakonuanlatimBinding
import com.mob.app.modules.carpmakonuanlatim.`data`.model.ListapplethreeTwo1RowModel
import com.mob.app.modules.carpmakonuanlatim.`data`.viewmodel.CarpmakonuanlatimVM
import com.mob.app.modules.carpmasecim.ui.CarpmasecimActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmakonuanlatimActivity :
    BaseActivity<ActivityCarpmakonuanlatimBinding>(R.layout.activity_carpmakonuanlatim) {
  private val viewModel: CarpmakonuanlatimVM by viewModels<CarpmakonuanlatimVM>()

  private val REQUEST_CODE_CARPMASECIM_ACTIVITY: Int = 127

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listapplethreeTwoAdapter =
    ListapplethreeTwoAdapter(viewModel.listapplethreeTwoList.value?:mutableListOf())
   // binding.recyclerListapplethreeTwo.adapter = listapplethreeTwoAdapter
    listapplethreeTwoAdapter.setOnItemClickListener(
    object : ListapplethreeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListapplethreeTwo1RowModel) {
        onClickRecyclerListapplethreeTwo(view, position, item)
      }
    }
    )
    viewModel.listapplethreeTwoList.observe(this) {
      listapplethreeTwoAdapter.updateData(it)
    }
    binding.carpmakonuanlatimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowhadirendikle.setOnClickListener {
      val destIntent = CarpmasecimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CARPMASECIM_ACTIVITY)
    }
  }

  fun onClickRecyclerListapplethreeTwo(
    view: View,
    position: Int,
    item: ListapplethreeTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARPMAKONUANLATIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmakonuanlatimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
