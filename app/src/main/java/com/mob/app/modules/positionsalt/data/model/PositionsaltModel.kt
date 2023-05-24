package com.mob.app.modules.positionsalt.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class PositionsaltModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopmasann: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_masan_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtALTINDA: String? = MyApp.getInstance().resources.getString(R.string.lbl_altinda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_rne_in3)

)
