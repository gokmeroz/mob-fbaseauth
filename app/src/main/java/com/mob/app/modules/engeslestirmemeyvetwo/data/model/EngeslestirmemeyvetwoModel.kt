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
