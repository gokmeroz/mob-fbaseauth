package com.mob.app.modules.engsaategzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngsaategzersizModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsmatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_match_the2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0230: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_30)
  ,
  var etMetinyazlacakValue: String? = null
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1115: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0300: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0645: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check2)

)
