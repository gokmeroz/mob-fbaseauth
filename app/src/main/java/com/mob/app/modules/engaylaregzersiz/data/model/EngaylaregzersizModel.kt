package com.mob.app.modules.engaylaregzersiz.`data`.model


import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String


data class EngaylaregzersizModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsfillint: String? =
    MyApp.getInstance().resources.getString(R.string.msg_let_s_fill_in_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check2)


)