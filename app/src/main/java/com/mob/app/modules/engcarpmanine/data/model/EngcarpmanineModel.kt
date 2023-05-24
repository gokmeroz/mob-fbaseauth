package com.mob.app.modules.engcarpmanine.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngcarpmanineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWritetheanswe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_the_answe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOPERATION: String? = MyApp.getInstance().resources.getString(R.string.lbl_operation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRESULT: String? = MyApp.getInstance().resources.getString(R.string.lbl_result)
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
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check3)

)
