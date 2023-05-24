package com.mob.app.modules.engsaategzersiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngsaategzersizBinding
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import com.mob.app.modules.engsaategzersiz.`data`.model.TypeRowModel
import com.mob.app.modules.engsaategzersiz.`data`.viewmodel.EngsaategzersizVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngsaategzersizActivity :
    BaseActivity<ActivityEngsaategzersizBinding>(R.layout.activity_engsaategzersiz) {
  private val viewModel: EngsaategzersizVM by viewModels<EngsaategzersizVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 936


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val typeAdapter = TypeAdapter(viewModel.typeList.value?:mutableListOf())
    //binding.recyclerType.adapter = typeAdapter
    typeAdapter.setOnItemClickListener(
    object : TypeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TypeRowModel) {
        onClickRecyclerType(view, position, item)
      }
    }
    )
    viewModel.typeList.observe(this) {
      typeAdapter.updateData(it)
    }
    binding.engsaategzersizVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearToday.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  fun onClickRecyclerType(
    view: View,
    position: Int,
    item: TypeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGSAATEGZERSIZ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngsaategzersizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
