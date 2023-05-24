package com.mob.app.modules.engwrite.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngwriteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPressthestart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_press_the_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuThreeValue: String? = null
)
