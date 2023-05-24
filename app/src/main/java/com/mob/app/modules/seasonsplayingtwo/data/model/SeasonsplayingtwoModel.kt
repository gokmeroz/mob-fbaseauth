package com.mob.app.modules.seasonsplayingtwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SeasonsplayingtwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAadakigrse: String? = MyApp.getInstance().resources.getString(R.string.msg_a_a_daki_g_rse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAadakikutuy: String? = MyApp.getInstance().resources.getString(R.string.msg_a_a_daki_kutuy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null
)
