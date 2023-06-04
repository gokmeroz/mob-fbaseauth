package com.mob.app.modules.saatvideo.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySaatvideoBinding
import com.mob.app.modules.saategzersiz.ui.SaategzersizActivity
import com.mob.app.modules.saatvideo.`data`.viewmodel.SaatvideoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SaatvideoActivity : BaseActivity<ActivitySaatvideoBinding>(R.layout.activity_saatvideo) {
  private val viewModel: SaatvideoVM by viewModels<SaatvideoVM>()

  private val REQUEST_CODE_SAATEGZERSIZ_ACTIVITY: Int = 795


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.saatvideoVM = viewModel

    val videoView = findViewById<VideoView>(R.id.viewsaatvideo) // VideoView'ı layout dosyanızda tanımladığınız id ile değiştirin
    val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.saatvideo)
    videoView.setVideoURI(videoUri)
    videoView.start()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowhadirendikle.setOnClickListener {
      val destIntent = SaategzersizActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAATEGZERSIZ_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SAATVIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SaatvideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
