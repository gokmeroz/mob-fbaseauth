package com.mob.app.modules.enggunleregzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EnggunleregzersizModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetslistthe: String? = MyApp.getInstance().resources.getString(R.string.msg_let_s_list_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_friday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_saturday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check)

)
