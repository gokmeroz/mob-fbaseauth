package com.mob.app.modules.eslestirmesayilartwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EslestirmesayilartwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHadieletirel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hadi_e_le_tirel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKIRKYED: String? = MyApp.getInstance().resources.getString(R.string.lbl_kirk_yed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtALTMIDOKUZ: String? = MyApp.getInstance().resources.getString(R.string.lbl_altmi_dokuz)

)