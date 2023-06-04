package com.mob.app.modules.carpmaone.`data`.model
import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String
data class CarpmaoneModel(
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
  /**
   * TODO Replace with dynamic value
   */
  var txt1X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_4)
  ,
  var txt1X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_0)
  ,
  var txt1X1: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_1)
  ,
  var txt1X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_2)
  ,
  var txt1X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_3)
  ,
  var txt1X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_5)
  ,
  var txt1X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_6)
  ,
  var txt1X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_7)
  ,
  var txt1X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_8)
  ,

  var txt1X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1_x_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2))