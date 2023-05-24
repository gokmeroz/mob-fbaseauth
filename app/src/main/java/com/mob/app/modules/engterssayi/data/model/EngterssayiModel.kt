package com.mob.app.modules.engterssayi.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngterssayiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWritethenumbe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_the_numbe2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
