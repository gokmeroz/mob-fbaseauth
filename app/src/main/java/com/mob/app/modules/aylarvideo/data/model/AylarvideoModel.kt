package com.mob.app.modules.aylarvideo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class AylarvideoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAadakivideo: String? = MyApp.getInstance().resources.getString(R.string.msg_a_a_daki_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHadirendikle: String? = MyApp.getInstance().resources.getString(R.string.msg_hadi_rendikle)

)
