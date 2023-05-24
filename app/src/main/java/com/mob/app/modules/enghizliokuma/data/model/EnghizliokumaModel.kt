package com.mob.app.modules.enghizliokuma.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EnghizliokumaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetswatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_watch_the2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfyouwatchth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_watch_th)

)
