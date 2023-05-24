package com.mob.app.modules.engseasonsplaying.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngseasonsplayingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhichseasondo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_which_season_do)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteitinthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_it_in_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null
)
