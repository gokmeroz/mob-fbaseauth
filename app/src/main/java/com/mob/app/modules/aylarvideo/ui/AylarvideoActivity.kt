package com.mob.app.modules.aylarvideo.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityAylarvideoBinding
import com.mob.app.modules.aylarozet.ui.AylarozetActivity
import com.mob.app.modules.aylarvideo.`data`.viewmodel.AylarvideoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AylarvideoActivity : BaseActivity<ActivityAylarvideoBinding>(R.layout.activity_aylarvideo) {
  private val viewModel: AylarvideoVM by viewModels<AylarvideoVM>()

  private val REQUEST_CODE_AYLAROZET_ACTIVITY: Int = 460


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aylarvideoVM = viewModel
    val videoView = findViewById<VideoView>(R.id.viewaylarvideo)
    val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.aylarvideo)
    videoView.setVideoURI(videoUri)
    videoView.start()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowhadirendikle.setOnClickListener {
      val destIntent = AylarozetActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_AYLAROZET_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "AYLARVIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AylarvideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}