package com.mob.app.modules.splashscreen.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SplashscreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMOB: String? = MyApp.getInstance().resources.getString(R.string.lbl_mob)

)
