package com.mob.app.modules.engeslestirmesecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngeslestirmesecimBinding
import com.mob.app.modules.engeslestirmehayvanlar.ui.EngeslestirmehayvanlarActivity
import com.mob.app.modules.engeslestirmehayvanlartwo.ui.EngeslestirmehayvanlartwoActivity
import com.mob.app.modules.engeslestirmemeyve.ui.EngeslestirmemeyveActivity
import com.mob.app.modules.engeslestirmemeyvetwo.ui.EngeslestirmemeyvetwoActivity
import com.mob.app.modules.engeslestirmerenk.ui.EngeslestirmerenkActivity
import com.mob.app.modules.engeslestirmerenktwo.ui.EngeslestirmerenktwoActivity
import com.mob.app.modules.engeslestirmesayilar.ui.EngeslestirmesayilarActivity
import com.mob.app.modules.engeslestirmesayilartwo.ui.EngeslestirmesayilartwoActivity
import com.mob.app.modules.engeslestirmesecim.`data`.model.GridnumberblocksoneRowModel
import com.mob.app.modules.engeslestirmesecim.`data`.viewmodel.EngeslestirmesecimVM
import com.mob.app.modules.eslestirmehayvanlar.ui.EslestirmehayvanlarActivity
import com.mob.app.modules.eslestirmemeyve.ui.EslestirmemeyveActivity
import com.mob.app.modules.eslestirmerenk.ui.EslestirmerenkActivity
import com.mob.app.modules.eslestirmerenktwo.ui.EslestirmerenktwoActivity
import com.mob.app.modules.eslestirmesayilar.ui.EslestirmesayilarActivity
import com.mob.app.modules.playing.ui.PlayingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngeslestirmesecimActivity :
    BaseActivity<ActivityEngeslestirmesecimBinding>(R.layout.activity_engeslestirmesecim) {
  private val viewModel: EngeslestirmesecimVM by viewModels<EngeslestirmesecimVM>()

  private val REQUEST_CODE_PLAYING_ACTIVITY: Int = 779

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridnumberblocksoneAdapter =
    GridnumberblocksoneAdapter(viewModel.gridnumberblocksoneList.value?:mutableListOf())
    //binding.recyclerGridnumberblocksone.adapter = gridnumberblocksoneAdapter
    gridnumberblocksoneAdapter.setOnItemClickListener(
    object : GridnumberblocksoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridnumberblocksoneRowModel) {
        onClickRecyclerGridnumberblocksone(view, position, item)
      }
    }
    )
    viewModel.gridnumberblocksoneList.observe(this) {
      gridnumberblocksoneAdapter.updateData(it)
    }
    binding.engeslestirmesecimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.sayilareng.setOnClickListener {
      val destIntent = EngeslestirmesayilartwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.hayvanlareng.setOnClickListener {
      val destIntent = EngeslestirmehayvanlartwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.renklereng.setOnClickListener {
      val destIntent = EngeslestirmerenktwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.meyvelereng.setOnClickListener {
      val destIntent = EngeslestirmemeyvetwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridnumberblocksone(
    view: View,
    position: Int,
    item: GridnumberblocksoneRowModel
  ): Unit {
    when(view.id) {
      R.id.frameStacknumberblocksone ->  {
        onClickRecyclerGridnumberblocksoneFrameStacknumberblocksone(view, position, item)
      }
    }
  }

  fun onClickRecyclerGridnumberblocksoneFrameStacknumberblocksone(
    view: View,
    position: Int,
    item: GridnumberblocksoneRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EngeslestirmehayvanlarActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = EngeslestirmesayilarActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 ->  {
        val destIntent = EngeslestirmerenkActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 ->  {
        val destIntent = EngeslestirmemeyveActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "ENGESLESTIRMESECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngeslestirmesecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
