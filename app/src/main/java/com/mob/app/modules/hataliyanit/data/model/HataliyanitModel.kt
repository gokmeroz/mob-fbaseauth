package com.mob.app.modules.hataliyanit.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class HataliyanitModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMAALESEFHATALI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_maalesef_hatali)

)
