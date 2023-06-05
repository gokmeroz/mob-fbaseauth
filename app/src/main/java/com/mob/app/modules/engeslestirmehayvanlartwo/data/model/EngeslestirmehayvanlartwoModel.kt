package com.mob.app.modules.engeslestirmehayvanlartwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngeslestirmehayvanlartwoModel(
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
  var txtmatchlion: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_lion)
  ,var txtmatchsquirral: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_squirrel)
  ,var txtmatchfox: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_fox)
  ,
  var txtmatchoctopus: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_octopus)
  ,

  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_squirrel)

)
