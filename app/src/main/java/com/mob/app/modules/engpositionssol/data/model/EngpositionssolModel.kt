package com.mob.app.modules.engpositionssol.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngpositionssolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheballis: String? = MyApp.getInstance().resources.getString(R.string.msg_the_ball_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBEHIND: String? = MyApp.getInstance().resources.getString(R.string.lbl_behind)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForexample: String? = MyApp.getInstance().resources.getString(R.string.msg_for_example4)

)
