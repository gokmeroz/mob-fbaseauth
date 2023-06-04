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
  var txtLEM: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_lem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSONU: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_sonu)
  ,
  var txt6X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_0)
  ,
  var txt6X1: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_1)
  ,
  var txt6X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_2)
  ,
  var txt6X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_5)
  ,
  /**

   * TODO Replace with dynamic value
   */
  var txt6X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_6_x_9)
  ,
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)
)