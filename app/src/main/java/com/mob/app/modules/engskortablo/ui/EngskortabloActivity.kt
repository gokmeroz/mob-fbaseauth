package com.mob.app.modules.engskortablo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngskortabloBinding
import com.mob.app.modules.engskortablo.`data`.model.EngskortabloRowModel
import com.mob.app.modules.engskortablo.`data`.viewmodel.EngskortabloVM
import com.mob.app.modules.playing.ui.PlayingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngskortabloActivity :
    BaseActivity<ActivityEngskortabloBinding>(R.layout.activity_engskortablo) {
  private val viewModel: EngskortabloVM by viewModels<EngskortabloVM>()

  private val REQUEST_CODE_PLAYING_ACTIVITY: Int = 809


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engskortabloAdapter =
    EngskortabloAdapter(viewModel.engskortabloList.value?:mutableListOf())
    binding.recyclerEngskortablo.adapter = engskortabloAdapter
    engskortabloAdapter.setOnItemClickListener(
    object : EngskortabloAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngskortabloRowModel) {
        onClickRecyclerEngskortablo(view, position, item)
      }
    }
    )
    viewModel.engskortabloList.observe(this) {
      engskortabloAdapter.updateData(it)
    }
    binding.engskortabloVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameEngSkorTablo.setOnClickListener {
      val destIntent = PlayingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_PLAYING_ACTIVITY)
    }
  }

  fun onClickRecyclerEngskortablo(
    view: View,
    position: Int,
    item: EngskortabloRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENGSKORTABLO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngskortabloActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
