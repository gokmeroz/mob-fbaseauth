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

  var etMetinyazlacakValue: String? = null
  ,

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


  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim)

)
