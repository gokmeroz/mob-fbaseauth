package com.mob.app.modules.carpmasecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityCarpmasecimBinding
import com.mob.app.modules.carpmaeight.ui.CarpmaeightActivity
import com.mob.app.modules.carpmafive.ui.CarpmafiveActivity
import com.mob.app.modules.carpmafour.ui.CarpmafourActivity
import com.mob.app.modules.carpmanine.ui.CarpmanineActivity
import com.mob.app.modules.carpmaone.ui.CarpmaoneActivity
import com.mob.app.modules.carpmasecim.`data`.model.CarpmasecimRowModel
import com.mob.app.modules.carpmasecim.`data`.viewmodel.CarpmasecimVM
import com.mob.app.modules.carpmaseven.ui.CarpmasevenActivity
import com.mob.app.modules.carpmasix.ui.CarpmasixActivity
import com.mob.app.modules.carpmathree.ui.CarpmathreeActivity
import com.mob.app.modules.carpmatwo.ui.CarpmatwoActivity
import com.mob.app.modules.learning.ui.LearningActivity
import com.mob.app.modules.ogrenme.ui.OgrenmeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarpmasecimActivity : BaseActivity<ActivityCarpmasecimBinding>(R.layout.activity_carpmasecim)
    {
  private val viewModel: CarpmasecimVM by viewModels<CarpmasecimVM>()

  private val REQUEST_CODE_OGRENME_ACTIVITY: Int = 299


  private val REQUEST_CODE_CARPMAONE_ACTIVITY: Int = 726


  private val REQUEST_CODE_CARPMASEVEN_ACTIVITY: Int = 312


  private val REQUEST_CODE_CARPMAFOUR_ACTIVITY: Int = 446


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carpmasecimAdapter =
    CarpmasecimAdapter(viewModel.carpmasecimList.value?:mutableListOf())
   // binding.recyclerCarpmasecim.adapter = carpmasecimAdapter
    carpmasecimAdapter.setOnItemClickListener(
    object : CarpmasecimAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarpmasecimRowModel) {
        onClickRecyclerCarpmasecim(view, position, item)
      }
    }
    )
    viewModel.carpmasecimList.observe(this) {
      carpmasecimAdapter.updateData(it)
    }
    binding.carpmasecimVM = viewModel
  }

      override fun setUpClicks(): Unit {
        binding.frameCarpmaSecim.setOnClickListener {
          val destIntent = LearningActivity.getIntent(this, null)
          startActivityForResult(destIntent, REQUEST_CODE_OGRENME_ACTIVITY)
        }

        binding.carpmasecimbir.setOnClickListener {
          val destIntent = CarpmaoneActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimiki.setOnClickListener {
          val destIntent = CarpmatwoActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimuc.setOnClickListener {
          val destIntent = CarpmathreeActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimdort.setOnClickListener {
          val destIntent = CarpmafourActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimbes.setOnClickListener {
          val destIntent = CarpmafiveActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimalti.setOnClickListener {
          val destIntent = CarpmasixActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimyedi.setOnClickListener {
          val destIntent = CarpmasevenActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimsekiz.setOnClickListener {
          val destIntent = CarpmaeightActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.carpmasecimdokuz.setOnClickListener {
          val destIntent = CarpmanineActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

  fun onClickRecyclerCarpmasecim(
    view: View,
    position: Int,
    item: CarpmasecimRowModel
  ): Unit {
    when(view.id) {
      R.id.viewRectangle2070 -> {
        val destIntent = CarpmaoneActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_CARPMAONE_ACTIVITY)
      }
      R.id.viewRectangle2070Two -> {
        val destIntent = CarpmasevenActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_CARPMASEVEN_ACTIVITY)
      }
      R.id.viewRectangle2070One -> {
        val destIntent = CarpmafourActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_CARPMAFOUR_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "CARPMASECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarpmasecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
