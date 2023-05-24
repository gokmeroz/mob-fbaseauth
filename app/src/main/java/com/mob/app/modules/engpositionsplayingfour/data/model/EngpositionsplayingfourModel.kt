package com.mob.app.modules.engpositionsplayingfour.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngpositionsplayingfourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInwhichoneis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_which_one_is4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check)

)
