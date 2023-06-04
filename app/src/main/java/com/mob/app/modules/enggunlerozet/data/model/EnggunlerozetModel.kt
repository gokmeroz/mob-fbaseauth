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
   *
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sunday),
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_monday),
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_tuesday),
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_thursday),
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_thursday),
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_friday),
  var txtPriceSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_saturday),
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_1),
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_2),
  var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_3),
  var txtPrice4: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_4),
  var txtPrice5: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_5),
  var txtPrice6: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_6),
  var txtPrice7: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_7),



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
