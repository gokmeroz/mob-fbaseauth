package com.mob.app.modules.engwrite.ui

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngwriteBinding
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import com.mob.app.modules.engwrite.`data`.viewmodel.EngwriteVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngwriteActivity : BaseActivity<ActivityEngwriteBinding>(R.layout.activity_engwrite) {
  private val viewModel: EngwriteVM by viewModels<EngwriteVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 933


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engwriteVM = viewModel
  }

  private lateinit var mediaPlayer: MediaPlayer

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_write)

    // Butonları tanımlayın
    val button1 = findViewById<ImageView>(R.id.imagePolygonOne)
    val button2 = findViewById<ImageView>(R.id.imagePolygonTwo)
    val button3 = findViewById<ImageView>(R.id.imagePolygonThree)
    val button4 = findViewById<ImageView>(R.id.imagePolygonFour)

    // MediaPlayer nesnesini oluşturun
    mediaPlayer = MediaPlayer()

    // Butonlara tıklama olaylarını ekleyin
    button1.setOnClickListener {
      playSound(R.raw.writeeng1)
    }

    button2.setOnClickListener {
      playSound(R.raw.writeeng2)
    }

    button3.setOnClickListener {
      playSound(R.raw.writeeng3)
    }

    button4.setOnClickListener {
      playSound(R.raw.writeeng4)
    }
  }

  private fun playSound(soundResId: Int) {
    // Önceki sesi durdurun (eğer varsa)
    if (mediaPlayer.isPlaying) {
      mediaPlayer.stop()
    }

    // Yeni ses kaydını yükleyin ve oynatın
    mediaPlayer = MediaPlayer.create(this, soundResId)
    mediaPlayer.start()
  }


  override fun setUpClicks(): Unit {
    binding.linearWhite.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGWRITE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngwriteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
