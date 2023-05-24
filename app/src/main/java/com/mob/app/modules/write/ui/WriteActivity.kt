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

class WriteActivity : BaseActivity<ActivityWriteBinding>(R.layout.activity_write) {
  private val viewModel: WriteVM by viewModels<WriteVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 187


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.writeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
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
