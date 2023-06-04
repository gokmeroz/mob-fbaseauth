package com.mob.app.modules.eslestirmesecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEslestirmesecimBinding
import com.mob.app.modules.eslestirmehayvanlar.ui.EslestirmehayvanlarActivity
import com.mob.app.modules.eslestirmehayvanlartwo.ui.EslestirmehayvanlartwoActivity
import com.mob.app.modules.eslestirmemeyve.ui.EslestirmemeyveActivity
import com.mob.app.modules.eslestirmemeyvetwo.ui.EslestirmemeyvetwoActivity
import com.mob.app.modules.eslestirmerenk.ui.EslestirmerenkActivity
import com.mob.app.modules.eslestirmerenktwo.ui.EslestirmerenktwoActivity
import com.mob.app.modules.eslestirmesayilar.ui.EslestirmesayilarActivity
import com.mob.app.modules.eslestirmesayilartwo.ui.EslestirmesayilartwoActivity
import com.mob.app.modules.eslestirmesecim.`data`.model.Gridnumberblocksone2RowModel
import com.mob.app.modules.eslestirmesecim.`data`.viewmodel.EslestirmesecimVM
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import com.mob.app.modules.oyun.ui.OyunActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EslestirmesecimActivity :
  BaseActivity<ActivityEslestirmesecimBinding>(R.layout.activity_eslestirmesecim) {
  private val viewModel: EslestirmesecimVM by viewModels<EslestirmesecimVM>()

  private val REQUEST_CODE_OYUN_ACTIVITY: Int = 227


  private val REQUEST_CODE_ESLESTIRMEMEYVE_ACTIVITY: Int = 620


  private val REQUEST_CODE_ESLESTIRMERENK_ACTIVITY: Int = 150


  private val REQUEST_CODE_ESLESTIRMEHAYVANLAR_ACTIVITY: Int = 568


  private val REQUEST_CODE_ESLESTIRMESAYILAR_ACTIVITY: Int = 724


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridnumberblocksoneAdapter =
      GridnumberblocksoneAdapter(viewModel.gridnumberblocksoneList.value?:mutableListOf())
    //binding.recyclerGridnumberblocksone.adapter = gridnumberblocksoneAdapter
    gridnumberblocksoneAdapter.setOnItemClickListener(
      object : GridnumberblocksoneAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : Gridnumberblocksone2RowModel) {
          onClickRecyclerGridnumberblocksone(view, position, item)
        }
      }
    )
    viewModel.gridnumberblocksoneList.observe(this) {
      gridnumberblocksoneAdapter.updateData(it)
    }
    binding.eslestirmesecimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.sayilar.setOnClickListener {
      val destIntent = EslestirmesayilartwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.hayvanlar.setOnClickListener {
      val destIntent = EslestirmehayvanlartwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.renkler.setOnClickListener {
      val destIntent = EslestirmerenktwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.meyveler.setOnClickListener {
      val destIntent = EslestirmemeyvetwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridnumberblocksone(
    view: View,
    position: Int,
    item: Gridnumberblocksone2RowModel
  ): Unit {
    when(view.id) {
      R.id.frameStacknumberblocksone -> {
        onClickRecyclerGridnumberblocksoneFrameStacknumberblocksone(view, position, item)
      }
    }
  }

  fun onClickRecyclerGridnumberblocksoneFrameStacknumberblocksone(
    view: View,
    position: Int,
    item: Gridnumberblocksone2RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = EslestirmemeyveActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ESLESTIRMEMEYVE_ACTIVITY)
      }
      1 -> {
        val destIntent = EslestirmerenkActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ESLESTIRMERENK_ACTIVITY)
      }
      2 -> {
        val destIntent = EslestirmehayvanlarActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ESLESTIRMEHAYVANLAR_ACTIVITY)
      }
      3 -> {
        val destIntent = EslestirmesayilarActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ESLESTIRMESAYILAR_ACTIVITY)
      }
    }
  }

companion object {
    const val TAG: String = "ESLESTIRMESECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EslestirmesecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

