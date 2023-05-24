package com.mob.app.modules.ogrenme.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class OgrenmeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHadirenelim: String? = MyApp.getInstance().resources.getString(R.string.lbl_hadi_renelim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRENELM: String? = MyApp.getInstance().resources.getString(R.string.lbl_renel_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOYNAYALIM: String? = MyApp.getInstance().resources.getString(R.string.lbl_oynayalim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)

)
