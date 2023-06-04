package com.mob.app.modules.positionsplaying.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityPositionsplayingBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.positionsplaying.`data`.model.Listbasketballone3RowModel
import com.mob.app.modules.positionsplaying.`data`.viewmodel.PositionsplayingVM
import com.mob.app.modules.positionsplayingtwo.ui.PositionsplayingtwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsplayingActivity :
    BaseActivity<ActivityPositionsplayingBinding>(R.layout.activity_positionsplaying) {
  private val viewModel: PositionsplayingVM by viewModels<PositionsplayingVM>()

  private val REQUEST_CODE_POSITIONSPLAYINGTWO_ACTIVITY: Int = 644

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbasketballoneAdapter =
    ListbasketballoneAdapter(viewModel.listbasketballoneList.value?:mutableListOf())
   // binding.recyclerListbasketballone.adapter = listbasketballoneAdapter
    listbasketballoneAdapter.setOnItemClickListener(
    object : ListbasketballoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbasketballone3RowModel) {
        onClickRecyclerListbasketballone(view, position, item)
      }
    }
    )
    viewModel.listbasketballoneList.observe(this) {
      listbasketballoneAdapter.updateData(it)
    }
    binding.positionsplayingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      Toast.makeText(this@PositionsplayingActivity,MyApp.getInstance().getString(R.string.msg_devam_etmek_i_in_bir_se_i),Toast.LENGTH_LONG).show()
    }
  }

  fun onClickRecyclerListbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone3RowModel
  ): Unit {
    when(view.id) {
      R.id.frameStackbasketballthree ->  {
        onClickRecyclerListbasketballoneFrameStackbasketballthree(view, position, item)
      }
      R.id.frameStackbasketballone ->  {
        onClickRecyclerListbasketballoneFrameStackbasketballone(view, position, item)
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballthree(
    view: View,
    position: Int,
    item: Listbasketballone3RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = PositionsplayingtwoActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_POSITIONSPLAYINGTWO_ACTIVITY)
      }
      1 -> {
        this@PositionsplayingActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
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
    item: Listbasketballone3RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        this@PositionsplayingActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
      1 -> {
        this@PositionsplayingActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "POSITIONSPLAYING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsplayingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
