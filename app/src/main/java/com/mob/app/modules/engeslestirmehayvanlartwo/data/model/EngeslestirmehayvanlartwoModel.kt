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

  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_squirrel)

)
