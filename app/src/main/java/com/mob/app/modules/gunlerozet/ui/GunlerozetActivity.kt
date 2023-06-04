package com.mob.app.modules.gunlerozet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityGunlerozetBinding
import com.mob.app.modules.gunlerozet.`data`.model.Listrectangle2080RowModel
import com.mob.app.modules.gunlerozet.`data`.model.Listrectangle2080TwoRowModel
import com.mob.app.modules.gunlerozet.`data`.viewmodel.GunlerozetVM
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GunlerozetActivity : BaseActivity<ActivityGunlerozetBinding>(R.layout.activity_gunlerozet) {
  private val viewModel: GunlerozetVM by viewModels<GunlerozetVM>()

  private val REQUEST_CODE_OGRENME_ACTIVITY: Int = 735


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle2080Adapter =
    Listrectangle2080Adapter(viewModel.listrectangle2080List.value?:mutableListOf())
   // binding.recyclerListrectangle2080.adapter = listrectangle2080Adapter
    listrectangle2080Adapter.setOnItemClickListener(
    object : Listrectangle2080Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2080RowModel) {
        onClickRecyclerListrectangle2080(view, position, item)
      }
    }
    )
    viewModel.listrectangle2080List.observe(this) {
      listrectangle2080Adapter.updateData(it)
    }
    val listrectangle2080TwoAdapter =
    Listrectangle2080TwoAdapter(viewModel.listrectangle2080TwoList.value?:mutableListOf())
  //  binding.recyclerListrectangle2080Two.adapter = listrectangle2080TwoAdapter
    listrectangle2080TwoAdapter.setOnItemClickListener(
    object : Listrectangle2080TwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle2080TwoRowModel) {
        onClickRecyclerListrectangle2080Two(view, position, item)
      }
    }
    )
    viewModel.listrectangle2080TwoList.observe(this) {
      listrectangle2080TwoAdapter.updateData(it)
    }
    binding.gunlerozetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameGunlerOzet.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OGRENME_ACTIVITY)
    }
  }

  fun onClickRecyclerListrectangle2080(
    view: View,
    position: Int,
    item: Listrectangle2080RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle2080Two(
    view: View,
    position: Int,
    item: Listrectangle2080TwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "GUNLEROZET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GunlerozetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
