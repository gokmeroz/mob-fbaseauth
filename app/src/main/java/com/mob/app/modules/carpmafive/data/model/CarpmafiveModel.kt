package com.mob.app.modules.carpmafive.`data`.model
import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String
data class CarpmafiveModel(
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
  var txt5X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_0)
  ,
  var txt5X1: String?
  =MyApp.getInstance().resources.getString(R.string.lbl_5_x_1)
  ,
  var txt5X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_2)
  ,
  var txt5X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_3)
  ,
  var txt5X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_5)

  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_5_x_9)
  ,
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)
)