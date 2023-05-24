package com.mob.app.modules.carpmasecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class CarpmasecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAlmakistedi: String? = MyApp.getInstance().resources.getString(R.string.msg_al_mak_istedi)

)
