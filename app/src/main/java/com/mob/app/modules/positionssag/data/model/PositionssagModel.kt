package com.mob.app.modules.positionssag.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class PositionssagModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopmasann: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_masan_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYANINDA: String? = MyApp.getInstance().resources.getString(R.string.lbl_yaninda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRnein: String? = MyApp.getInstance().resources.getString(R.string.msg_rne_in2)

)
