package com.mob.app.modules.seasonsecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SeasonsecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRenmekistedi: String? = MyApp.getInstance().resources.getString(R.string.msg_renmek_istedi)

)
