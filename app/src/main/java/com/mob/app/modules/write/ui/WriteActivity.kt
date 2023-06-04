package com.mob.app.modules.write.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityWriteBinding
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.write.`data`.viewmodel.WriteVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import android.content.res.Resources
import android.media.Image
import android.media.MediaPlayer
import android.widget.Button
import android.widget.ImageView


class WriteActivity : BaseActivity<ActivityWriteBinding>(R.layout.activity_write) {
  private val viewModel: WriteVM by viewModels<WriteVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 187

  /* val mediaPlayer = MediaPlayer.create(this, R.raw.writetr1)
  val mediaPlayer2 = MediaPlayer.create(this, R.raw.writetr2)
  val mediaPlayer3 = MediaPlayer.create(this, R.raw.writetr3)
  val mediaPlayer4 = MediaPlayer.create(this, R.raw.writetr4)
  val imageView1= findViewById<ImageView>(R.id.imagePolygonOne)
  val imageView2= findViewById<ImageView>(R.id.imagePolygonTwo)
  val imageView3= findViewById<ImageView>(R.id.imagePolygonThree)
  val imageview4= findViewById<ImageView>(R.id.imagePolygonFour)
*/



  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.writeVM = viewModel

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
      playSound(R.raw.writetr1)
    }

    button2.setOnClickListener {
      playSound(R.raw.writetr2)
    }

    button3.setOnClickListener {
      playSound(R.raw.writetr3)
    }

    button4.setOnClickListener {
      playSound(R.raw.writetr4)
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
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }
  companion object {
    const val TAG: String = "WRITE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WriteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
  }


