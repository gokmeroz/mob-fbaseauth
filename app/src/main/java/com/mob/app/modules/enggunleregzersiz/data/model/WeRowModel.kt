package com.mob.app.modules.enggunleregzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class WeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt1GNThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_g_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDayCounterFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_6)

)
