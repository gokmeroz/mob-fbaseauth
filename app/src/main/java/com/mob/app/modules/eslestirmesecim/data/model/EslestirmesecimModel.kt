package com.mob.app.modules.eslestirmesecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EslestirmesecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOynamakistedi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_oynamak_istedi)

)
