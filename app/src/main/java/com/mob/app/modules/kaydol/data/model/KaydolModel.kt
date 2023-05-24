package com.mob.app.modules.kaydol.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class KaydolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHogeldiniz: String? = MyApp.getInstance().resources.getString(R.string.lbl_ho_geldiniz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiriyapnvey: String? = MyApp.getInstance().resources.getString(R.string.msg_giri_yap_n_vey)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiriyap: String? = MyApp.getInstance().resources.getString(R.string.lbl_giri_yap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSim: String? = MyApp.getInstance().resources.getString(R.string.lbl_sim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfreoluturun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ifre_olu_turun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDevam: String? = MyApp.getInstance().resources.getString(R.string.lbl_devam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etIsimEditKaydolValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailKaydolValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSifreOlusturKayValue: String? = null
)
