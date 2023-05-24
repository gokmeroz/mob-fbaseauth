package com.mob.app.modules.eslestirmehayvanlar.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EslestirmehayvanlarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHadieletirel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hadi_e_le_tirel)

)
