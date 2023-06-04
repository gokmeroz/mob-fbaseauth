package com.mob.app.modules.engcarpmaseven.`data`.model
import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String
data class EngcarpmasevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWritetheanswe: String? =
    MyApp.getInstance().resources.getString(R.string.msg_write_the_answe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOPERATION: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_operation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRESULT: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7X0: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_0)
  ,
  var txt7X1: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_1)
  ,
  var txt7X2: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_2)
  ,
  var txt7X3: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7X4: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */

  var txt7X5: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7X6: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7X7: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7X8: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7X9: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_7_x_9)
  ,
  var carpmasonuc: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_let_s_check3)
)