package com.mob.app.modules.positionson.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class PositionsonModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopmasann: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_masan_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNNDE: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_nde)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_rne_in4)

)
