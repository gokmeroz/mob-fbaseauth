package com.mob.app.modules.enggunleregzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class Listrec130RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_tuesday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1GN: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_g_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDayCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_3)

)
