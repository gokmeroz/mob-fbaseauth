package com.mob.app.modules.carpmaone.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class CarpmaoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArpmailemler: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arpma_i_lemler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLEM: String? = MyApp.getInstance().resources.getString(R.string.lbl_lem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSONU: String? = MyApp.getInstance().resources.getString(R.string.lbl_sonu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1X4: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1X5: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_x_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)

)
