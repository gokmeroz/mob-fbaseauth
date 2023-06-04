package com.mob.app.modules.engpositionsplayingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.appcomponents.di.MyApp
import com.mob.app.databinding.ActivityEngpositionsplayingfourBinding
import com.mob.app.extensions.alert
import com.mob.app.extensions.neutralButton
import com.mob.app.modules.engdogruyanit.ui.EngdogruyanitActivity
import com.mob.app.modules.engpositionsplayingfour.`data`.model.Listbasketballone2RowModel
import com.mob.app.modules.engpositionsplayingfour.`data`.viewmodel.EngpositionsplayingfourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngpositionsplayingfourActivity :
    BaseActivity<ActivityEngpositionsplayingfourBinding>(R.layout.activity_engpositionsplayingfour)
    {
  private val viewModel: EngpositionsplayingfourVM by viewModels<EngpositionsplayingfourVM>()

  private val REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY: Int = 966

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbasketballoneAdapter =
    ListbasketballoneAdapter(viewModel.listbasketballoneList.value?:mutableListOf())
    //binding.recyclerListbasketballone.adapter = listbasketballoneAdapter
    listbasketballoneAdapter.setOnItemClickListener(
    object : ListbasketballoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbasketballone2RowModel) {
        onClickRecyclerListbasketballone(view, position, item)
      }
    }
    )
    viewModel.listbasketballoneList.observe(this) {
      listbasketballoneAdapter.updateData(it)
    }
    binding.engpositionsplayingfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearWithin.setOnClickListener {
      Toast.makeText(this@EngpositionsplayingfourActivity,MyApp.getInstance().getString(R.string.msg_you_need_to_se_an_op_be_co),Toast.LENGTH_LONG).show()
    }
  }

  fun onClickRecyclerListbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone2RowModel
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
    item: Listbasketballone2RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = EngdogruyanitActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ENGDOGRUYANIT_ACTIVITY)
      }
      1 -> {
        this@EngpositionsplayingfourActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
        MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
          neutralButton {
          }
        }
      }
    }
  }

  fun onClickRecyclerListbasketballoneFrameStackbasketballone(
    view: View,
    position: Int,
    item: Listbasketballone2RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        this@EngpositionsplayingfourActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
        MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
          neutralButton {
          }
        }
      }
      1 -> {
        this@EngpositionsplayingfourActivity.alert(MyApp.getInstance().getString(R.string.msg_let_s_try_again),
        MyApp.getInstance().getString(R.string.msg_unfortunately_you_gave_the_wrong_an_n_try_again)) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "ENGPOSITIONSPLAYINGFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngpositionsplayingfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
