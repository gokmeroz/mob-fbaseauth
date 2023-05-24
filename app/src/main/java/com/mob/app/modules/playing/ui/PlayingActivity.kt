package com.mob.app.modules.playing.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityPlayingBinding
import com.mob.app.modules.engaylaregzersiz.ui.EngaylaregzersizActivity
import com.mob.app.modules.engeslestirmesecim.ui.EngeslestirmesecimActivity
import com.mob.app.modules.enggunleregzersiz.ui.EnggunleregzersizActivity
import com.mob.app.modules.enghizliokuma.ui.EnghizliokumaActivity
import com.mob.app.modules.engpositionsplaying.ui.EngpositionsplayingActivity
import com.mob.app.modules.engsaategzersiz.ui.EngsaategzersizActivity
import com.mob.app.modules.engsayidizileri.ui.EngsayidizileriActivity
import com.mob.app.modules.engseasonsplaying.ui.EngseasonsplayingActivity
import com.mob.app.modules.engskortablo.ui.EngskortabloActivity
import com.mob.app.modules.engterssayi.ui.EngterssayiActivity
import com.mob.app.modules.learning.ui.LearningActivity
import com.mob.app.modules.playing.`data`.model.PlayingRowModel
import com.mob.app.modules.playing.`data`.viewmodel.PlayingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlayingActivity : BaseActivity<ActivityPlayingBinding>(R.layout.activity_playing) {
  private val viewModel: PlayingVM by viewModels<PlayingVM>()

  private val REQUEST_CODE_ENGSKORTABLO_ACTIVITY: Int = 633


  private val REQUEST_CODE_ENGGUNLEREGZERSIZ_ACTIVITY: Int = 873


  private val REQUEST_CODE_ENGSAATEGZERSIZ_ACTIVITY: Int = 358


  private val REQUEST_CODE_ENGAYLAREGZERSIZ_ACTIVITY: Int = 395


  private val REQUEST_CODE_ENGESLESTIRMESECIM_ACTIVITY: Int = 859


  private val REQUEST_CODE_ENGHIZLIOKUMA_ACTIVITY: Int = 793


  private val REQUEST_CODE_ENGTERSSAYI_ACTIVITY: Int = 681


  private val REQUEST_CODE_ENGSAYIDIZILERI_ACTIVITY: Int = 246


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val playingAdapter = PlayingAdapter(viewModel.playingList.value?:mutableListOf())
    //binding.recyclerPlaying.adapter = playingAdapter
    playingAdapter.setOnItemClickListener(
    object : PlayingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PlayingRowModel) {
        onClickRecyclerPlaying(view, position, item)
      }
    }
    )
    viewModel.playingList.observe(this) {
      playingAdapter.updateData(it)
    }
    binding.playingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStacki.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.puanPlaying.setOnClickListener {
      val destIntent = EngskortabloActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGSKORTABLO_ACTIVITY)
    }
    binding.mevsimlerPlaying.setOnClickListener {
      val destIntent = EngseasonsplayingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.gunlerPlaying.setOnClickListener {
      val destIntent = EnggunleregzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGGUNLEREGZERSIZ_ACTIVITY)
    }
    binding.analogPlaying.setOnClickListener {
      val destIntent = EngsaategzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGSAATEGZERSIZ_ACTIVITY)
    }
    binding.aylarPlaying.setOnClickListener {
      val destIntent = EngaylaregzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGAYLAREGZERSIZ_ACTIVITY)
    }
    binding.yonlerPlaying.setOnClickListener {
      val destIntent = EngpositionsplayingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.eslestirmePlaying.setOnClickListener {
      val destIntent = EngeslestirmesecimActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGESLESTIRMESECIM_ACTIVITY)
    }
    binding.hizliOkumaPlaying.setOnClickListener {
      val destIntent = EnghizliokumaActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGHIZLIOKUMA_ACTIVITY)
    }
    binding.sayilarOyun.setOnClickListener {
      val destIntent = EngsayidizileriActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGHIZLIOKUMA_ACTIVITY)
    }
    binding.tersSayiPlaying.setOnClickListener {
      val destIntent = EngterssayiActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGHIZLIOKUMA_ACTIVITY)
    }
  }

  fun onClickRecyclerPlaying(
    view: View,
    position: Int,
    item: PlayingRowModel
  ): Unit {
    when(view.id) {
      R.id.imageDigitsP -> {
        onClickRecyclerPlayingImageDigitsP(view, position, item)
      }
    }
  }

  fun onClickRecyclerPlayingImageDigitsP(
    view: View,
    position: Int,
    item: PlayingRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = EngterssayiActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGTERSSAYI_ACTIVITY)
      }
      1 -> {
        val destIntent = EngsayidizileriActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGSAYIDIZILERI_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "PLAYING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlayingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
