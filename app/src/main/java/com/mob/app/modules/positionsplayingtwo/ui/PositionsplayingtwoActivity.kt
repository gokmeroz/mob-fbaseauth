package com.mob.app.modules.positionsplayingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityPositionsplayingtwoBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.positionsplayingthree.ui.PositionsplayingthreeActivity
import com.mob.app.modules.positionsplayingtwo.`data`.model.Listbasketballone4RowModel
import com.mob.app.modules.positionsplayingtwo.`data`.viewmodel.PositionsplayingtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PositionsplayingtwoActivity :
    BaseActivity<ActivityPositionsplayingtwoBinding>(R.layout.activity_positionsplayingtwo) {
  private val viewModel: PositionsplayingtwoVM by viewModels<PositionsplayingtwoVM>()

  private val REQUEST_CODE_POSITIONSPLAYINGTHREE_ACTIVITY: Int = 353


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbasketballoneAdapter =
    ListbasketballoneAdapter(viewModel.listbasketballoneList.value?:mutableListOf())
    binding.recyclerListbasketballone.adapter = listbasketballoneAdapter
    listbasketballoneAdapter.setOnItemClickListener(
    object : ListbasketballoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbasketballone4RowModel) {
        onClickRecyclerListbasketballone(view, position, item)
      }
    }
    )
    viewModel.listbasketballoneList.observe(this) {
      listbasketballoneAdapter.updateData(it)
    }
    binding.positionsplayingtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowkontroledelim.setOnClickListener {
      Toast.makeText(this@PositionsplayingtwoActivity,MyApp.getInstance().getString(R.string.msg_devam_etmek_i_in_bir_se_i),Toast.LENGTH_LONG).show()
    }
  }

  fun onClickRecyclerListbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone4RowModel
  ): Unit {
    when(view.id) {
      R.id.frameStackbasketballone -> {
        onClickRecyclerListbasketballoneFrameStackbasketballone(view, position, item)
      }
      R.id.frameStackbasketballthree -> {
        onClickRecyclerListbasketballoneFrameStackbasketballthree(view, position, item)
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone4RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = PositionsplayingthreeActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_POSITIONSPLAYINGTHREE_ACTIVITY)
      }
      1 -> {
        this@PositionsplayingtwoActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballthree(
    view: View,
    position: Int,
    item: Listbasketballone4RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        this@PositionsplayingtwoActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
      1 -> {
        this@PositionsplayingtwoActivity.alert(MyApp.getInstance().getString(R.string.msg_hadi_tekrar_deneyeli_m),
        MyApp.getInstance().getString(R.string.msg_maalesef_hatal_yan_t_ve_te_de)) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "POSITIONSPLAYINGTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PositionsplayingtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
