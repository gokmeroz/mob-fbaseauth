package com.mob.app.modules.engaylarozet.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngaylarozetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetstakealo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_take_a_lo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMAY: String? = MyApp.getInstance().resources.getString(R.string.lbl_may)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJUNE: String? = MyApp.getInstance().resources.getString(R.string.lbl_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJULY: String? = MyApp.getInstance().resources.getString(R.string.lbl_july)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_september)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOCTOBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_october)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNOVEMBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_november)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDECEMBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_december)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAUGUST: String? = MyApp.getInstance().resources.getString(R.string.lbl_august)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.lbl_january)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonthOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_february)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMARCH: String? = MyApp.getInstance().resources.getString(R.string.lbl_march)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAPRIL: String? = MyApp.getInstance().resources.getString(R.string.lbl_april)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsreinforce: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_reinforce)

)
