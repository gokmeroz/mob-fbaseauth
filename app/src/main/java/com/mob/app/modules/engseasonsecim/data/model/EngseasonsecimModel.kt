package com.mob.app.modules.engseasonsecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngseasonsecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClickonthese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_click_on_the_se)

)
