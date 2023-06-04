package com.mob.app.modules.engsayidizileri.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngsayidizileriBinding
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import com.mob.app.modules.engsayidizileri.`data`.viewmodel.EngsayidizileriVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.random.Random

class EngsayidizileriActivity :
    BaseActivity<ActivityEngsayidizileriBinding>(R.layout.activity_engsayidizileri) {
  private val viewModel: EngsayidizileriVM by viewModels<EngsayidizileriVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 773


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engsayidizileriVM = viewModel
    val sayigosterici = findViewById<TextView>(R.id.sayigostericieng)

    val randomSayi = Random.nextInt(1, 101)
    sayigosterici.text = randomSayi.toString()

  }

  override fun setUpClicks(): Unit {
    binding.linearRowcontinue.setOnClickListener {
      val destIntent = EngdogruyanitActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ENGSAYIDIZILERI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngsayidizileriActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
