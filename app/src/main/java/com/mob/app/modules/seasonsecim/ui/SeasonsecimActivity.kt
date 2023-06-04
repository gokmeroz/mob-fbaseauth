package com.mob.app.modules.seasonsecim.ui
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivitySeasonsecimBinding
import com.mob.app.modules.girisyap.ui.GirisyapActivity
import com.mob.app.modules.ilkbahar.ui.IlkbaharActivity
import com.mob.app.modules.kis.ui.KisActivity
import com.mob.app.modules.login.ui.LoginActivity
import com.mob.app.modules.oyun.ui.OyunActivity
import com.mob.app.modules.seasonsecim.`data`.model.SeasonsecimRowModel
import com.mob.app.modules.seasonsecim.`data`.viewmodel.SeasonsecimVM
import com.mob.app.modules.sonbahar.ui.SonbaharActivity
import com.mob.app.modules.yaz.ui.YazActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
class SeasonsecimActivity : BaseActivity<ActivitySeasonsecimBinding>(R.layout.activity_seasonsecim)
{
  private val viewModel: SeasonsecimVM by viewModels<SeasonsecimVM>()
  private val REQUEST_CODE_OYUN_ACTIVITY: Int = 229
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seasonsecimVM = viewModel
  }
  override fun setUpClicks(): Unit {
    binding.ilkbahar.setOnClickListener {
      val destIntent = IlkbaharActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.yaz.setOnClickListener {
      val destIntent = YazActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.sonbahar.setOnClickListener {
      val destIntent = SonbaharActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.kis.setOnClickListener {
      val destIntent = KisActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }
  companion object {
    const val TAG: String = "SEASONSECIM_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeasonsecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

