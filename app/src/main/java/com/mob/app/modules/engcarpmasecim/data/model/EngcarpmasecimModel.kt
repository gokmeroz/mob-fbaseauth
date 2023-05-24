package com.mob.app.modules.engcarpmasecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngcarpmasecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosethenumb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_the_numb)

)
