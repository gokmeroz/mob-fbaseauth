package com.mob.app.modules.spring.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SpringModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_welcome2)

)
