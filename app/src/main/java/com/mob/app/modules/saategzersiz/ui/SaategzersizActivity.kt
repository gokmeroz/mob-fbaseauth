package com.mob.app.modules.saategzersiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySaategzersizBinding
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.saategzersiz.`data`.model.SaategzersizRowModel
import com.mob.app.modules.saategzersiz.`data`.viewmodel.SaategzersizVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SaategzersizActivity :
    BaseActivity<ActivitySaategzersizBinding>(R.layout.activity_saategzersiz) {
  private val viewModel: SaategzersizVM by viewModels<SaategzersizVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 733


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val saategzersizAdapter =
    SaategzersizAdapter(viewModel.saategzersizList.value?:mutableListOf())
    //binding.recyclerSaategzersiz.adapter = saategzersizAdapter
    saategzersizAdapter.setOnItemClickListener(
    object : SaategzersizAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SaategzersizRowModel) {
        onClickRecyclerSaategzersiz(view, position, item)
      }
    }
    )
    viewModel.saategzersizList.observe(this) {
      saategzersizAdapter.updateData(it)
    }
    binding.saategzersizVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerSaategzersiz(
    view: View,
    position: Int,
    item: SaategzersizRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SAATEGZERSIZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SaategzersizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
