package com.mob.app.modules.eslestirmemeyvetwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EslestirmemeyvetwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null,
  var txtHadieletirel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hadi_e_le_tirel)

)
