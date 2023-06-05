package com.mob.app.modules.engeslestirmerenktwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngeslestirmerenktwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null,
  var txtmatchone: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  var txtmatchtwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,  var txtmatchthree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,  var txtmatchfour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  var txtmatchpink: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pink)
  ,var txtmatchyellow: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_yellow)
  ,var txtmatchorange: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_orange)
  ,var txtmatchgreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_green)
  ,


  var txtLetsmatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_match_the)

)
