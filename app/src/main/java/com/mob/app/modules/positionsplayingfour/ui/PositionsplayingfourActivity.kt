package com.mob.app.modules.positionsplayingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityPositionsplayingfourBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.dogruyanit.ui.DogruyanitActivity
import com.mob.app.modules.positionsplayingfour.`data`.model.Listbasketballone5RowModel
import com.mob.app.modules.positionsplayingfour.`data`.viewmodel.PositionsplayingfourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsplayingfourActivity :
    BaseActivity<ActivityPositionsplayingfourBinding>(R.layout.activity_positionsplayingfour) {
  private val viewModel: PositionsplayingfourVM by viewModels<PositionsplayingfourVM>()

  private val REQUEST_CODE_DOGRUYANIT_ACTIVITY: Int = 445


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbasketballoneAdapter =
    ListbasketballoneAdapter(viewModel.listbasketballoneList.value?:mutableListOf())
   // binding.recyclerListbasketballone.adapter = listbasketballoneAdapter
    listbasketballoneAdapter.setOnItemClickListener(
    object : ListbasketballoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbasketballone5RowModel) {
        onClickRecyclerListbasketballone(view, position, item)
      }
    }
    )
    viewModel.listbasketballoneList.observe(this) {
      listbasketballoneAdapter.updateData(it)
    }
    binding.positionsplayingfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      Toast.makeText(this@PositionsplayingfourActivity,MyApp.getInstance().getString(R.string.msg_devam_etmek_i_in_bir_se_i),Toast.LENGTH_LONG).show()
    }
  }

  fun onClickRecyclerListbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone5RowModel
  ): Unit {
    when(view.id) {
      R.id.frameStackbasketballthree -> {
        onClickRecyclerListbasketballoneFrameStackbasketballthree(view, position, item)
      }
      R.id.frameStackbasketballone -> {
        onClickRecyclerListbasketballoneFrameStackbasketballone(view, position, item)
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballthree(
    view: View,
    position: Int,
    item: Listbasketballone5RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = DogruyanitActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_DOGRUYANIT_ACTIVITY)
      }
      1 -> {
        this@PositionsplayingfourActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone5RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        this@PositionsplayingfourActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
      1 -> {
        this@PositionsplayingfourActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "POSITIONSPLAYINGFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsplayingfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
