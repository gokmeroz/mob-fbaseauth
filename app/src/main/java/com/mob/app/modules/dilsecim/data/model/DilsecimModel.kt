package com.mob.app.modules.dilsecim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class DilsecimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_select_your_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDLNZSEN: String? = MyApp.getInstance().resources.getString(R.string.lbl_d_l_n_z_se_n)

)
