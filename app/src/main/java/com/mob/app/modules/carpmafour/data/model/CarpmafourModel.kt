package com.mob.app.modules.carpmafour.`data`.model
import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String
data class CarpmafourModel(
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
  var txt4X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_0)
  ,
  var txt4X1: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_1)
  ,
  var txt4X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_2)
  ,
  var txt4X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_5)
  ,

  var txt4X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_6)
  ,
  var txt4X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_7)
  ,
  var txt4X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_8)
  ,
  var txt4X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4_x_9)
  ,
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)
)