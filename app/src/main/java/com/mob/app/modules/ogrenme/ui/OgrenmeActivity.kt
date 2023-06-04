package com.mob.app.modules.ogrenme.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityOgrenmeBinding
import com.mob.app.modules.aylartanitim.ui.AylartanitimActivity
import com.mob.app.modules.carpmatanitim.ui.CarpmatanitimActivity
import com.mob.app.modules.gunlertanitim.ui.GunlertanitimActivity
import com.mob.app.modules.hizliokumatanitim.ui.HizliokumatanitimActivity
import com.mob.app.modules.ogrenme.`data`.model.OgrenmeRowModel
import com.mob.app.modules.ogrenme.`data`.viewmodel.OgrenmeVM
import com.mob.app.modules.oyun.ui.OyunActivity
import com.mob.app.modules.positionstanitim.ui.PositionstanitimActivity
import com.mob.app.modules.puan.ui.PuanActivity
import com.mob.app.modules.saattanitim.ui.SaattanitimActivity
import com.mob.app.modules.sayidizileritanitim.ui.SayidizileritanitimActivity
import com.mob.app.modules.seasonstanitim.ui.SeasonstanitimActivity
import com.mob.app.modules.terssayitanitim.ui.TerssayitanitimActivity
import com.mob.app.modules.writetanitim.ui.WritetanitimActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OgrenmeActivity : BaseActivity<ActivityOgrenmeBinding>(R.layout.activity_ogrenme) {
  private val viewModel: OgrenmeVM by viewModels<OgrenmeVM>()

  private val REQUEST_CODE_SAATTANITIM_ACTIVITY: Int = 935


  private val REQUEST_CODE_GUNLERTANITIM_ACTIVITY: Int = 333


  private val REQUEST_CODE_AYLARTANITIM_ACTIVITY: Int = 145


  private val REQUEST_CODE_CARPMATANITIM_ACTIVITY: Int = 570


  private val REQUEST_CODE_HIZLIOKUMATANITIM_ACTIVITY: Int = 367


  private val REQUEST_CODE_PUAN_ACTIVITY: Int = 886


  private val REQUEST_CODE_TERSSAYITANITIM_ACTIVITY: Int = 681


  private val REQUEST_CODE_SAYIDIZILERITANITIM_ACTIVITY: Int = 669


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val ogrenmeAdapter = OgrenmeAdapter(viewModel.ogrenmeList.value?:mutableListOf())

    //binding.recyclerOgrenme.adapter = ogrenmeAdapter
    ogrenmeAdapter.setOnItemClickListener(
    object : OgrenmeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OgrenmeRowModel) {
        onClickRecyclerOgrenme(view, position, item)
      }
    }
    )
    viewModel.ogrenmeList.observe(this) {
      ogrenmeAdapter.updateData(it)
    }
    binding.ogrenmeVM = viewModel
  }


  override fun setUpClicks(): Unit {
    binding.a7.setOnClickListener {
      val destIntent = SaattanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAATTANITIM_ACTIVITY)
    }
    binding.frameStackrectangle2031.setOnClickListener {
      val destIntent = SayidizileritanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAATTANITIM_ACTIVITY)
    }
    binding.frameStackrectangle2032.setOnClickListener {
      val destIntent = WritetanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAATTANITIM_ACTIVITY)
    }
    binding.a12.setOnClickListener {
      val destIntent = GunlertanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GUNLERTANITIM_ACTIVITY)
    }
    binding.a20.setOnClickListener {
      val destIntent = SeasonstanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEllipse778.setOnClickListener {
      val destIntent = OyunActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.a8.setOnClickListener {
      val destIntent = AylartanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_AYLARTANITIM_ACTIVITY)
    }
    binding.a23.setOnClickListener {
      val destIntent = PositionstanitimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackrectangle2048.setOnClickListener {
      val destIntent = CarpmatanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CARPMATANITIM_ACTIVITY)
    }
    binding.a24.setOnClickListener {
      val destIntent = HizliokumatanitimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HIZLIOKUMATANITIM_ACTIVITY)
    }
    binding.frameStackrectangle2047.setOnClickListener {
      val destIntent = PuanActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_PUAN_ACTIVITY)
    }
  }

  fun onClickRecyclerOgrenme(
    view: View,
    position: Int,
    item: OgrenmeRowModel
  ): Unit {
    when(view.id) {
      R.id.imageRectangle2046 -> {
        onClickRecyclerOgrenmeImageRectangle2046(view, position, item)
      }
    }
  }

  fun onClickRecyclerOgrenmeImageRectangle2046(
    view: View,
    position: Int,
    item: OgrenmeRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = TerssayitanitimActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_TERSSAYITANITIM_ACTIVITY)
      }
      1 -> {
        val destIntent = SayidizileritanitimActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_SAYIDIZILERITANITIM_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "OGRENME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OgrenmeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
