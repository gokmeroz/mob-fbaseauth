package com.mob.app.modules.engcarpmaone.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngcarpmaoneModel(
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
  var txt1X4: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1X5: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_x_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check3)

)
