package com.mob.app.modules.engpositionsplaying.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngpositionsplayingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInwhichoneis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_which_one_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetscheck: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_check)

)
