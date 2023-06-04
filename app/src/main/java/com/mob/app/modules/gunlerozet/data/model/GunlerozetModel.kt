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
  var txtPriceBir: String? = MyApp.getInstance().resources.getString(R.string.lbl_pazartes),
  var txtPriceİki: String? = MyApp.getInstance().resources.getString(R.string.lbl_sali),
  var txtPriceUc: String? = MyApp.getInstance().resources.getString(R.string.lbl_ar_amba),
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_per_embe),
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_cuma),
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_cumartes),
  var txtPriceSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_pazar),
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_g_n),
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_g_n),
  var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_g_n),
  var txtPrice4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_g_n),
  var txtPrice5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_g_n),
  var txtPrice6: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_g_n),
  var txtPrice7: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_g_n),


)
