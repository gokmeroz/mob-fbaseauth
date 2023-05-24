package com.mob.app.modules.positionssol.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class PositionssolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopmasann: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_masan_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtARKASINDA: String? = MyApp.getInstance().resources.getString(R.string.lbl_arkasinda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRneins: String? = MyApp.getInstance().resources.getString(R.string.msg_rne_in_s)

)
