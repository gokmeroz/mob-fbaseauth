package com.mob.app.modules.engcarpmakonuanlatim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngcarpmakonuanlatimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsstartby: String? = MyApp.getInstance().resources.getString(R.string.msg_let_s_start_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfthereareThree: String? =
    MyApp.getInstance().resources.getString(R.string.msg_if_there_are_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThequestionas: String? =
    MyApp.getInstance().resources.getString(R.string.msg_the_question_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBASKETS: String? = MyApp.getInstance().resources.getString(R.string.lbl_baskets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNUMBEROFAPPLE: String? =
    MyApp.getInstance().resources.getString(R.string.msg_number_of_apple)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3XThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_1_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3XTwentySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_2_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3XThirtyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_3_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X412: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_4_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThereareatot: String? =
    MyApp.getInstance().resources.getString(R.string.msg_there_are_a_tot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsreinforce: String? =
    MyApp.getInstance().resources.getString(R.string.msg_let_s_reinforce)

)