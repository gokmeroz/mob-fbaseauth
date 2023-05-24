package com.mob.app.modules.enggunlerozet.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EnggunlerozetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDayCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDayCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.lbl_sunday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_monday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_tuesday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_wednesday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_thursday)
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

)
