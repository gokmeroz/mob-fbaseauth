package com.mob.app.modules.aylaregzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class AylaregzersizModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBoluklartama: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bo_luklar_tama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHAZRAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_haz_ran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEYLL: String? = MyApp.getInstance().resources.getString(R.string.lbl_eyl_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNine: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtARALIK: String? = MyApp.getInstance().resources.getString(R.string.lbl_aralik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAUSTOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_ustos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.msg3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUBAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_ubat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNSAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_san)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim)

)
