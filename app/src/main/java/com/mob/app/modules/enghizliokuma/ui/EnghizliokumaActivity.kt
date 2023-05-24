package com.mob.app.modules.enghizliokuma.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEnghizliokumaBinding
import com.mob.app.modules.enghizliokuma.`data`.viewmodel.EnghizliokumaVM
import com.mob.app.modules.learning.ui.LearningActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import android.os.Environment
import android.net.Uri.*




class EnghizliokumaActivity :
    BaseActivity<ActivityEnghizliokumaBinding>(R.layout.activity_enghizliokuma) {
  private val viewModel: EnghizliokumaVM by viewModels<EnghizliokumaVM>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_enghizliokuma)

    val videoView = findViewById<VideoView>(R.id.viewenghizlivideo)
    //Creating MediaController
    val mediaController = MediaController(this)
    mediaController.setAnchorView(videoView)
    //specify the location of media file
    val uri:Uri = parse(Environment.getExternalStorageDirectory().getPath()  +
            "/Users/mertozdogan/Desktop/mob-master/app/src/main/res/raw/hizliokumavideo.mp4")
    //Setting MediaController and URI, then starting the videoView
    videoView.setMediaController(mediaController)
    videoView.setVideoURI(uri)
    videoView.requestFocus()
    videoView.start()
  }

  private val REQUEST_CODE_LEARNING_ACTIVITY: Int = 505


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enghizliokumaVM = viewModel

  }

  override fun setUpClicks(): Unit {
    binding.frameEngHizliOkuma.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEARNING_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGHIZLIOKUMA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnghizliokumaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
