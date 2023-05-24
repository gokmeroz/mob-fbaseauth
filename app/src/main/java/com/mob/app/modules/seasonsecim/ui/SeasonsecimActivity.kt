package com.mob.app.modules.seasonsecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonsecimBinding
import com.mob.app.modules.ilkbahar.ui.IlkbaharActivity
import com.mob.app.modules.kis.ui.KisActivity
import com.mob.app.modules.oyun.ui.OyunActivity
import com.mob.app.modules.seasonsecim.`data`.model.SeasonsecimRowModel
import com.mob.app.modules.seasonsecim.`data`.viewmodel.SeasonsecimVM
import com.mob.app.modules.sonbahar.ui.SonbaharActivity
import com.mob.app.modules.yaz.ui.YazActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeasonsecimActivity : BaseActivity<ActivitySeasonsecimBinding>(R.layout.activity_seasonsecim)
    {
  private val viewModel: SeasonsecimVM by viewModels<SeasonsecimVM>()

  private val REQUEST_CODE_OYUN_ACTIVITY: Int = 229


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val seasonsecimAdapter =
    SeasonsecimAdapter(viewModel.seasonsecimList.value?:mutableListOf())
    binding.recyclerSeasonsecim.adapter = seasonsecimAdapter
    seasonsecimAdapter.setOnItemClickListener(
    object : SeasonsecimAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SeasonsecimRowModel) {
        onClickRecyclerSeasonsecim(view, position, item)
      }
    }
    )
    viewModel.seasonsecimList.observe(this) {
      seasonsecimAdapter.updateData(it)
    }
    binding.seasonsecimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameSeasonSecim.setOnClickListener {
      val destIntent = OyunActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OYUN_ACTIVITY)
    }
  }

  fun onClickRecyclerSeasonsecim(
    view: View,
    position: Int,
    item: SeasonsecimRowModel
  ): Unit {
    when(view.id) {
      R.id.image48865861 -> {
        onClickRecyclerSeasonsecimImage48865861(view, position, item)
      }
    }
  }

  fun onClickRecyclerSeasonsecimImage48865861(
    view: View,
    position: Int,
    item: SeasonsecimRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = SonbaharActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = KisActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = YazActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = IlkbaharActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SEASONSECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonsecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
