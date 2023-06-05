package com.mob.app.modules.terssayi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityTerssayiBinding
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.terssayi.`data`.viewmodel.TerssayiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.random.Random

class TerssayiActivity : BaseActivity<ActivityTerssayiBinding>(R.layout.activity_terssayi) {
  private val viewModel: TerssayiVM by viewModels<TerssayiVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 565


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.terssayiVM = viewModel
    val sayigosterici = findViewById<TextView>(R.id.sayigosterici)

    val randomSayi = Random.nextInt(1, 101)
    sayigosterici.text = randomSayi.toString()

  }

  override fun setUpClicks(): Unit {
    binding.linearRowdevam.setOnClickListener {
      val destIntent = DogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "TERSSAYI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TerssayiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
