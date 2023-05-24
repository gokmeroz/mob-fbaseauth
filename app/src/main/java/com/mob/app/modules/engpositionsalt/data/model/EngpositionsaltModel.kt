package com.mob.app.modules.engpositionsalt.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngpositionsaltModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheballis: String? = MyApp.getInstance().resources.getString(R.string.msg_the_ball_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUNDER: String? = MyApp.getInstance().resources.getString(R.string.lbl_under)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_for_example3)

)
