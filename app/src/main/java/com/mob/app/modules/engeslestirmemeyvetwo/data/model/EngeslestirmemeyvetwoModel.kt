package com.mob.app.modules.engeslestirmemeyvetwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngeslestirmemeyvetwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsmatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_match_the)
  ,
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
  var txtmatchbanana: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_banana)
  , var txtmatchpineapple: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_pineapple)
  , var txtmatchpeach: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_peach)
  , var txtmatchgrape: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_grape)
  ,


  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_strawberry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_pineapple)

)
