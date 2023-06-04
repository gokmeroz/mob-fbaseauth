package com.mob.app.modules.engcarpmasecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngcarpmasecimBinding
import com.mob.app.modules.carpmaeight.ui.CarpmaeightActivity
import com.mob.app.modules.carpmafive.ui.CarpmafiveActivity
import com.mob.app.modules.carpmafour.ui.CarpmafourActivity
import com.mob.app.modules.carpmanine.ui.CarpmanineActivity
import com.mob.app.modules.carpmaone.ui.CarpmaoneActivity
import com.mob.app.modules.carpmaseven.ui.CarpmasevenActivity
import com.mob.app.modules.carpmasix.ui.CarpmasixActivity
import com.mob.app.modules.carpmathree.ui.CarpmathreeActivity
import com.mob.app.modules.carpmatwo.ui.CarpmatwoActivity
import com.mob.app.modules.engcarpmaeight.ui.EngcarpmaeightActivity
import com.mob.app.modules.engcarpmafive.ui.EngcarpmafiveActivity
import com.mob.app.modules.engcarpmafour.ui.EngcarpmafourActivity
import com.mob.app.modules.engcarpmanine.ui.EngcarpmanineActivity
import com.mob.app.modules.engcarpmaone.ui.EngcarpmaoneActivity
import com.mob.app.modules.engcarpmasecim.`data`.model.EngcarpmasecimRowModel
import com.mob.app.modules.engcarpmasecim.`data`.viewmodel.EngcarpmasecimVM
import com.mob.app.modules.engcarpmaseven.ui.EngcarpmasevenActivity
import com.mob.app.modules.engcarpmasix.ui.EngcarpmasixActivity
import com.mob.app.modules.engcarpmathree.ui.EngcarpmathreeActivity
import com.mob.app.modules.engcarpmatwo.ui.EngcarpmatwoActivity
import com.mob.app.modules.learning.ui.LearningActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngcarpmasecimActivity :
    BaseActivity<ActivityEngcarpmasecimBinding>(R.layout.activity_engcarpmasecim) {
  private val viewModel: EngcarpmasecimVM by viewModels<EngcarpmasecimVM>()

  private val REQUEST_CODE_LEARNING_ACTIVITY: Int = 617

  private val REQUEST_CODE_ENGCARPMASEVEN_ACTIVITY: Int = 844

  private val REQUEST_CODE_ENGCARPMAONE_ACTIVITY: Int = 801

  private val REQUEST_CODE_ENGCARPMAFOUR_ACTIVITY: Int = 975

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engcarpmasecimAdapter =
    EngcarpmasecimAdapter(viewModel.engcarpmasecimList.value?:mutableListOf())
   // binding.recyclerEngcarpmasecim.adapter = engcarpmasecimAdapter
    engcarpmasecimAdapter.setOnItemClickListener(
    object : EngcarpmasecimAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngcarpmasecimRowModel) {
        onClickRecyclerEngcarpmasecim(view, position, item)
      }
    }
    )
    viewModel.engcarpmasecimList.observe(this) {
      engcarpmasecimAdapter.updateData(it)
    }
    binding.engcarpmasecimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameEngCarpmaSecim.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEARNING_ACTIVITY)
    }

    binding.engcarpmasecimbir.setOnClickListener {
      val destIntent = EngcarpmaoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimiki.setOnClickListener {
      val destIntent = EngcarpmatwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimuc.setOnClickListener {
      val destIntent = EngcarpmathreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimdort.setOnClickListener {
      val destIntent = EngcarpmafourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimbes.setOnClickListener {
      val destIntent = EngcarpmafiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimalti.setOnClickListener {
      val destIntent = EngcarpmasixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimyedi.setOnClickListener {
      val destIntent = EngcarpmasevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimsekiz.setOnClickListener {
      val destIntent = EngcarpmaeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.engcarpmasecimdokuz.setOnClickListener {
      val destIntent = EngcarpmanineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }
  

  fun onClickRecyclerEngcarpmasecim(
    view: View,
    position: Int,
    item: EngcarpmasecimRowModel
  ): Unit {
    when(view.id) {
      R.id.viewRectangle2070Two ->  {
        val destIntent = EngcarpmasevenActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGCARPMASEVEN_ACTIVITY)
      }
      R.id.viewRectangle2070 ->  {
        val destIntent = EngcarpmaoneActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGCARPMAONE_ACTIVITY)
      }
      R.id.viewRectangle2070One ->  {
        val destIntent = EngcarpmafourActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGCARPMAFOUR_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "ENGCARPMASECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngcarpmasecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
