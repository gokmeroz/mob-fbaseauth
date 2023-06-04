package com.mob.app.modules.carpmathree.`data`.model
import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String
data class CarpmathreeModel(
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
  var txt3X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_0)
  ,
  var txt3X1: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_1)
  ,
  var txt3X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_2)
  ,
  var txt3X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_5)
  ,

  /**
   * TODO Replace with dynamic value
   */
  var txt3X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3_x_9)
  ,
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)
)