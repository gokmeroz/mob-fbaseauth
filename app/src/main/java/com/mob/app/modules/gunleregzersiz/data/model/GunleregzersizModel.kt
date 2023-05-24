package com.mob.app.modules.gunleregzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class GunleregzersizModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHaftanngnler: String? =
      MyApp.getInstance().resources.getString(R.string.msg_haftan_n_g_nler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCUMARTES: String? = MyApp.getInstance().resources.getString(R.string.lbl_cumartes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_pazar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim)

)
