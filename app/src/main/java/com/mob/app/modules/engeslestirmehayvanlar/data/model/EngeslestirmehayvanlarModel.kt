package com.mob.app.modules.engeslestirmehayvanlar.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngeslestirmehayvanlarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsmatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_match_the)

)
