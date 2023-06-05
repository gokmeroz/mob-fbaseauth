package com.mob.app.modules.eslestirmemeyvetwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EslestirmemeyvetwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null,
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

  var txtHadieletirel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hadi_e_le_tirel)

)
