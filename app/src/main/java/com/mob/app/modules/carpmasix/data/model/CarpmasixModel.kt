package com.mob.app.modules.carpmasix.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class CarpmasixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArpmailemler: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arpma_i_lemler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLEM: String? = MyApp.getInstance().resources.getString(R.string.lbl_lem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSONU: String? = MyApp.getInstance().resources.getString(R.string.lbl_sonu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X4: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X5: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_x_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)

)
