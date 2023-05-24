package com.mob.app.modules.engeslestirmesecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngeslestirmesecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosethecate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_the_cate)

)
