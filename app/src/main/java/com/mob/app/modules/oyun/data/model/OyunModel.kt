package com.mob.app.modules.oyun.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class OyunModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHadielenelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hadi_e_lenelim)
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
