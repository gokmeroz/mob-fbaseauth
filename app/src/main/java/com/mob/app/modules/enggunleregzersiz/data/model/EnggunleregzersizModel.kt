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

  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null,

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
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check)


)