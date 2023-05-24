package com.mob.app.modules.positionsplayingfour.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class PositionsplayingfourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHangisindetop: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hangisinde_top4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim)

)
