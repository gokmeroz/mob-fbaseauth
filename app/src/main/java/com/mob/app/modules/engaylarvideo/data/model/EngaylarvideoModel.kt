package com.mob.app.modules.engaylarvideo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngaylarvideoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetswatchthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_watch_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsreinforce: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_reinforce)

)
