package com.mob.app.modules.eslestirmerenk.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmerenkBinding
import com.mob.app.modules.eslestirmerenk.`data`.model.EslestirmerenkRowModel
import com.mob.app.modules.eslestirmerenk.`data`.viewmodel.EslestirmerenkVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EslestirmerenkActivity :
    BaseActivity<ActivityEslestirmerenkBinding>(R.layout.activity_eslestirmerenk) {
  private val viewModel: EslestirmerenkVM by viewModels<EslestirmerenkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val eslestirmerenkAdapter =
    EslestirmerenkAdapter(viewModel.eslestirmerenkList.value?:mutableListOf())
    binding.recyclerEslestirmerenk.adapter = eslestirmerenkAdapter
    eslestirmerenkAdapter.setOnItemClickListener(
    object : EslestirmerenkAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EslestirmerenkRowModel) {
        onClickRecyclerEslestirmerenk(view, position, item)
      }
    }
    )
    viewModel.eslestirmerenkList.observe(this) {
      eslestirmerenkAdapter.updateData(it)
    }
    binding.eslestirmerenkVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerEslestirmerenk(
    view: View,
    position: Int,
    item: EslestirmerenkRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ESLESTIRMERENK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmerenkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
