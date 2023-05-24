package com.mob.app.modules.skortablo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySkortabloBinding
import com.mob.app.modules.oyun.ui.OyunActivity
import com.mob.app.modules.skortablo.`data`.model.SkortabloRowModel
import com.mob.app.modules.skortablo.`data`.viewmodel.SkortabloVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SkortabloActivity : BaseActivity<ActivitySkortabloBinding>(R.layout.activity_skortablo) {
  private val viewModel: SkortabloVM by viewModels<SkortabloVM>()

  private val REQUEST_CODE_OYUN_ACTIVITY: Int = 979


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val skortabloAdapter = SkortabloAdapter(viewModel.skortabloList.value?:mutableListOf())
    binding.recyclerSkortablo.adapter = skortabloAdapter
    skortabloAdapter.setOnItemClickListener(
    object : SkortabloAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SkortabloRowModel) {
        onClickRecyclerSkortablo(view, position, item)
      }
    }
    )
    viewModel.skortabloList.observe(this) {
      skortabloAdapter.updateData(it)
    }
    binding.skortabloVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameSkorTablo.setOnClickListener {
      val destIntent = OyunActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OYUN_ACTIVITY)
    }
  }

  fun onClickRecyclerSkortablo(
    view: View,
    position: Int,
    item: SkortabloRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SKORTABLO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SkortabloActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
