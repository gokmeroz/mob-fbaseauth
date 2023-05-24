package com.mob.app.modules.engcarpmathree.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngcarpmathreeModel(
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
  var txt3X4: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X5: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X6: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X7: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X8: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X9: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check3)

)
