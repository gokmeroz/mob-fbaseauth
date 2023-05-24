package com.mob.app.modules.hizliokuma.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class HizliokumaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAadakivideo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_a_daki_video2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVideoyuhergn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_videoyu_her_g_n)

)
