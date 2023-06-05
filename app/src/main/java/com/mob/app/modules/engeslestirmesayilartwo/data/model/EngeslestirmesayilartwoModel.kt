package com.mob.app.modules.engeslestirmesayilartwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngeslestirmesayilartwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsmatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_match_the)
  ,
  var txtmatchone: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  var txtmatchtwo: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,  var txtmatchthree: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,  var txtmatchfour: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,


  var etMetinyazlacakValue: String? = null,

  /**
   * TODO Replace with dynamic value
   */
  var txtTHIRTYTHREE: String? = MyApp.getInstance().resources.getString(R.string.lbl_thirty_three)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFOURTYSEVEN: String? = MyApp.getInstance().resources.getString(R.string.lbl_fourty_seven)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFIFTYONE: String? = MyApp.getInstance().resources.getString(R.string.lbl_fifty_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSIXTYNINEOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sixty_nine)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtONEHUNDRED: String? = MyApp.getInstance().resources.getString(R.string.lbl_one_hundred)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_eighteen)

)
