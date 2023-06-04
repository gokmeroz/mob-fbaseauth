package com.mob.app.modules.gunleregzersiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityGunleregzersizBinding
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2062RowModel
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2075RowModel
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2080FiveRowModel
import com.mob.app.modules.gunleregzersiz.`data`.viewmodel.GunleregzersizVM
import com.mob.app.modules.gunlerozet.ui.GunlerozetActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GunleregzersizActivity :
    BaseActivity<ActivityGunleregzersizBinding>(R.layout.activity_gunleregzersiz) {
  private val viewModel: GunleregzersizVM by viewModels<GunleregzersizVM>()

  private val REQUEST_CODE_GUNLEROZET_ACTIVITY: Int = 117


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle2062Adapter =
    Listrectangle2062Adapter(viewModel.listrectangle2062List.value?:mutableListOf())
   // binding.recyclerListrectangle2062.adapter = listrectangle2062Adapter
    listrectangle2062Adapter.setOnItemClickListener(
    object : Listrectangle2062Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2062RowModel) {
        onClickRecyclerListrectangle2062(view, position, item)
      }
    }
    )
    viewModel.listrectangle2062List.observe(this) {
      listrectangle2062Adapter.updateData(it)
    }
    val listrectangle2075Adapter =
    Listrectangle2075Adapter(viewModel.listrectangle2075List.value?:mutableListOf())
   // binding.recyclerListrectangle2075.adapter = listrectangle2075Adapter
    listrectangle2075Adapter.setOnItemClickListener(
    object : Listrectangle2075Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2075RowModel) {
        onClickRecyclerListrectangle2075(view, position, item)
      }
    }
    )
    viewModel.listrectangle2075List.observe(this) {
      listrectangle2075Adapter.updateData(it)
    }
    val listrectangle2080FiveAdapter =
    Listrectangle2080FiveAdapter(viewModel.listrectangle2080FiveList.value?:mutableListOf())
   // binding.recyclerListrectangle2080Five.adapter = listrectangle2080FiveAdapter
    listrectangle2080FiveAdapter.setOnItemClickListener(
    object : Listrectangle2080FiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectangle2080FiveRowModel) {
        onClickRecyclerListrectangle2080Five(view, position, item)
      }
    }
    )
    viewModel.listrectangle2080FiveList.observe(this) {
      listrectangle2080FiveAdapter.updateData(it)
    }
    binding.gunleregzersizVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = GunlerozetActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GUNLEROZET_ACTIVITY)
    }
  }

  fun onClickRecyclerListrectangle2062(
    view: View,
    position: Int,
    item: Listrectangle2062RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle2075(
    view: View,
    position: Int,
    item: Listrectangle2075RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle2080Five(
    view: View,
    position: Int,
    item: Listrectangle2080FiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "GUNLEREGZERSIZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GunleregzersizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
