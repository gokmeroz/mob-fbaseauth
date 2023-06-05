package com.mob.app.modules.engterssayi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngterssayiBinding
import com.mob.app.modules.engterssayi.`data`.viewmodel.EngterssayiVM
import kotlin.String
import kotlin.Unit
import kotlin.random.Random

class EngterssayiActivity : BaseActivity<ActivityEngterssayiBinding>(R.layout.activity_engterssayi)
    {
  private val viewModel: EngterssayiVM by viewModels<EngterssayiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engterssayiVM = viewModel
    val sayigosterici = findViewById<TextView>(R.id.sayigosterici)

    val randomSayi = Random.nextInt(1, 101)
    sayigosterici.text = randomSayi.toString()

  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENGTERSSAYI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngterssayiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
