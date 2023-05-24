package com.mob.app.modules.enggunleregzersiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnggunleregzersizBinding
import com.mob.app.modules.enggunleregzersiz.`data`.model.Listrec130RowModel
import com.mob.app.modules.enggunleregzersiz.`data`.model.Listrec136RowModel
import com.mob.app.modules.enggunleregzersiz.`data`.model.WeRowModel
import com.mob.app.modules.enggunleregzersiz.`data`.viewmodel.EnggunleregzersizVM
import com.mob.app.modules.enggunlerozet.ui.EnggunlerozetActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EnggunleregzersizActivity :
    BaseActivity<ActivityEnggunleregzersizBinding>(R.layout.activity_enggunleregzersiz) {
  private val viewModel: EnggunleregzersizVM by viewModels<EnggunleregzersizVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrec136Adapter = Listrec136Adapter(viewModel.listrec136List.value?:mutableListOf())
    binding.recyclerListrec136.adapter = listrec136Adapter
    listrec136Adapter.setOnItemClickListener(
    object : Listrec136Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrec136RowModel) {
        onClickRecyclerListrec136(view, position, item)
      }
    }
    )
    viewModel.listrec136List.observe(this) {
      listrec136Adapter.updateData(it)
    }
    val listrec130Adapter = Listrec130Adapter(viewModel.listrec130List.value?:mutableListOf())
    binding.recyclerListrec130.adapter = listrec130Adapter
    listrec130Adapter.setOnItemClickListener(
    object : Listrec130Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrec130RowModel) {
        onClickRecyclerListrec130(view, position, item)
      }
    }
    )
    viewModel.listrec130List.observe(this) {
      listrec130Adapter.updateData(it)
    }
    val weAdapter = WeAdapter(viewModel.weList.value?:mutableListOf())
    binding.recyclerWe.adapter = weAdapter
    weAdapter.setOnItemClickListener(
    object : WeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : WeRowModel) {
        onClickRecyclerWe(view, position, item)
      }
    }
    )
    viewModel.weList.observe(this) {
      weAdapter.updateData(it)
    }
    binding.enggunleregzersizVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearVisit.setOnClickListener {
      val destIntent = EnggunlerozetActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrec136(
    view: View,
    position: Int,
    item: Listrec136RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrec130(
    view: View,
    position: Int,
    item: Listrec130RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerWe(
    view: View,
    position: Int,
    item: WeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGGUNLEREGZERSIZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnggunleregzersizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
