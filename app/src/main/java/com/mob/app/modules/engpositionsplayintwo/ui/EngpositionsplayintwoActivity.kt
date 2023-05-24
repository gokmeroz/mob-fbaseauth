package com.mob.app.modules.engpositionsplayintwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityEngpositionsplayintwoBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.engpositionsplayingthree.ui.EngpositionsplayingthreeActivity
import com.mob.app.modules.engpositionsplayintwo.`data`.model.Listbasketballone1RowModel
import com.mob.app.modules.engpositionsplayintwo.`data`.viewmodel.EngpositionsplayintwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngpositionsplayintwoActivity :
    BaseActivity<ActivityEngpositionsplayintwoBinding>(R.layout.activity_engpositionsplayintwo) {
  private val viewModel: EngpositionsplayintwoVM by viewModels<EngpositionsplayintwoVM>()

  private val REQUEST_CODE_ENGPOSITIONSPLAYINGTHREE_ACTIVITY: Int = 922

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbasketballoneAdapter =
    ListbasketballoneAdapter(viewModel.listbasketballoneList.value?:mutableListOf())
    binding.recyclerListbasketballone.adapter = listbasketballoneAdapter
    listbasketballoneAdapter.setOnItemClickListener(
    object : ListbasketballoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbasketballone1RowModel) {
        onClickRecyclerListbasketballone(view, position, item)
      }
    }
    )
    viewModel.listbasketballoneList.observe(this) {
      listbasketballoneAdapter.updateData(it)
    }
    binding.engpositionsplayintwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearWriter.setOnClickListener {
      Toast.makeText(this@EngpositionsplayintwoActivity,MyApp.getInstance().getString(R.string.msg_you_need_to_se_an_op_be_co),Toast.LENGTH_LONG).show()
    }
  }

  fun onClickRecyclerListbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone1RowModel
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
    item: Listbasketballone1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        this@EngpositionsplayintwoActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
        MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
          neutralButton {
          }
        }
      }
      1 -> {
        this@EngpositionsplayintwoActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
        MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_ag)) {
          neutralButton {
          }
        }
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EngpositionsplayingthreeActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGPOSITIONSPLAYINGTHREE_ACTIVITY)
      }
      1 -> {
        this@EngpositionsplayintwoActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
        MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_ag)) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSPLAYINTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionsplayintwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
