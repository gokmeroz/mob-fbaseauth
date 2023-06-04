package com.mob.app.modules.carpmaeight.`data`.model
import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String
data class CarpmaeightModel(
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
  var txt8X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_0)
  ,
  var txt8X1: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_1)
  ,
  var txt8X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_2)
  ,
  var txt8X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt8X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt8X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_5)
  ,
  var txt8X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_6)
  ,

  var txt8X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_7)
  ,
  var txt8X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_8)
  ,
  var txt8X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_8_x_9)
  ,
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)
)