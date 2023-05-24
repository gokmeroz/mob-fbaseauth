package com.mob.app.modules.gunlerozet.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class GunlerozetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTebriklerTekr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tebrikler_tekr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_pazartes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSALI: String? = MyApp.getInstance().resources.getString(R.string.lbl_sali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtARAMBA: String? = MyApp.getInstance().resources.getString(R.string.lbl_ar_amba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPEREMBE: String? = MyApp.getInstance().resources.getString(R.string.lbl_per_embe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCUMA: String? = MyApp.getInstance().resources.getString(R.string.lbl_cuma)
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

)
