package com.mob.app.modules.terssayi.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class TerssayiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYukardagrd: String? = MyApp.getInstance().resources.getString(R.string.msg_yukar_da_g_rd2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDevam: String? = MyApp.getInstance().resources.getString(R.string.lbl_devam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null
)
