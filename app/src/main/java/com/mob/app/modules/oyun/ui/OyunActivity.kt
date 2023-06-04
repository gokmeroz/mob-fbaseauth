package com.mob.app.modules.oyun.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityOyunBinding
import com.mob.app.modules.aylaregzersiz.ui.AylaregzersizActivity
import com.mob.app.modules.eslestirmesecim.ui.EslestirmesecimActivity
import com.mob.app.modules.gunleregzersiz.ui.GunleregzersizActivity
import com.mob.app.modules.hizliokuma.ui.HizliokumaActivity
import com.mob.app.modules.memorygame.models.MemoryGame
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import com.mob.app.modules.oyun.`data`.model.OyunRowModel
import com.mob.app.modules.oyun.`data`.viewmodel.OyunVM
import com.mob.app.modules.positionsplaying.ui.PositionsplayingActivity
import com.mob.app.modules.saategzersiz.ui.SaategzersizActivity
import com.mob.app.modules.sayidizileri.ui.SayidizileriActivity
import com.mob.app.modules.seasonsplaying.ui.SeasonsplayingActivity
import com.mob.app.modules.skortablo.ui.SkortabloActivity
import com.mob.app.modules.terssayi.ui.TerssayiActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OyunActivity : BaseActivity<ActivityOyunBinding>(R.layout.activity_oyun) {
  private val viewModel: OyunVM by viewModels<OyunVM>()

  private val REQUEST_CODE_HIZLIOKUMA_ACTIVITY: Int = 435


  private val REQUEST_CODE_ESLESTIRMESECIM_ACTIVITY: Int = 874


  private val REQUEST_CODE_AYLAREGZERSIZ_ACTIVITY: Int = 200


  private val REQUEST_CODE_GUNLEREGZERSIZ_ACTIVITY: Int = 857


  private val REQUEST_CODE_SAATEGZERSIZ_ACTIVITY: Int = 148


  private val REQUEST_CODE_SKORTABLO_ACTIVITY: Int = 704


  private val REQUEST_CODE_TERSSAYI_ACTIVITY: Int = 367


  private val REQUEST_CODE_SAYIDIZILERI_ACTIVITY: Int = 326


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val oyunAdapter = OyunAdapter(viewModel.oyunList.value?:mutableListOf())
    //binding.recyclerOyun.adapter = oyunAdapter
    oyunAdapter.setOnItemClickListener(
    object : OyunAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OyunRowModel) {
        onClickRecyclerOyun(view, position, item)
      }
    }
    )
    viewModel.oyunList.observe(this) {
      oyunAdapter.updateData(it)
    }
    binding.oyunVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.hizliOkumaOyun.setOnClickListener {
      val destIntent = HizliokumaActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HIZLIOKUMA_ACTIVITY)
    }
    binding.eslestirmeOyun.setOnClickListener {
      val destIntent = EslestirmesecimActivity.getIntent(this, null)
      startActivityForResult(destIntent,REQUEST_CODE_ESLESTIRMESECIM_ACTIVITY)
    }
    binding.yonlerOyun.setOnClickListener {
      val destIntent = PositionsplayingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.aylarOyun.setOnClickListener {
      val destIntent = AylaregzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_AYLAREGZERSIZ_ACTIVITY)
    }
    binding.gunlerOyun.setOnClickListener {
      val destIntent = GunleregzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GUNLEREGZERSIZ_ACTIVITY)
    }
    binding.mevsimlerOyun.setOnClickListener {
      val destIntent = SeasonsplayingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.analogOyun.setOnClickListener {
      val destIntent = SaategzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAATEGZERSIZ_ACTIVITY)
    }
    binding.imageEllipse777.setOnClickListener {
      val destIntent = OgrenmeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.puanOyun.setOnClickListener {
      val destIntent = SkortabloActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SKORTABLO_ACTIVITY)
    }
    binding.sayilarOyun.setOnClickListener {
      val destIntent = SayidizileriActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SKORTABLO_ACTIVITY)
    }
    binding.tersSayiOyun.setOnClickListener {
      val destIntent = TerssayiActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SKORTABLO_ACTIVITY)
    }
  }

  fun onClickRecyclerOyun(
    view: View,
    position: Int,
    item: OyunRowModel
  ): Unit {
    when(view.id) {
      R.id.imageRectangle2046 -> {
        onClickRecyclerOyunImageRectangle2046(view, position, item)
      }
    }
  }

  fun onClickRecyclerOyunImageRectangle2046(
    view: View,
    position: Int,
    item: OyunRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = TerssayiActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_TERSSAYI_ACTIVITY)
      }
      1 -> {
        val destIntent = SayidizileriActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_SAYIDIZILERI_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "OYUN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OyunActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
