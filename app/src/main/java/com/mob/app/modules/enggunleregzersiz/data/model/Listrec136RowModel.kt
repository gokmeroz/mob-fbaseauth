package com.mob.app.modules.enggunleregzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class Listrec136RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.lbl_sunday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDayCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_day_1)

)
