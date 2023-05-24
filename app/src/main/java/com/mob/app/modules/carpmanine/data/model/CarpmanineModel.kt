package com.mob.app.modules.carpmanine.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class CarpmanineModel(
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
  var txt9X4: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt9X5: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_x_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt9X6: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_x_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt9X7: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt9X8: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_x_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt9X9: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_x_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)

)
