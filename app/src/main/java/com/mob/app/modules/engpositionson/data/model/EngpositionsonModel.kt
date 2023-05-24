package com.mob.app.modules.engpositionson.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngpositionsonModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheballis: String? = MyApp.getInstance().resources.getString(R.string.msg_the_ball_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_in_front_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_for_example5)

)
