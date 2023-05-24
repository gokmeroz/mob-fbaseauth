package com.mob.app.modules.skortablo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SkortabloModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtElindekialtn: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_elindeki_alt_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtK: String? = MyApp.getInstance().resources.getString(R.string.lbl_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPUAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_puan)

)
