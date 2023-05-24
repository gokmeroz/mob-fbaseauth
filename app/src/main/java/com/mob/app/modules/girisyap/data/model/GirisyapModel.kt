package com.mob.app.modules.girisyap.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class GirisyapModel(
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
  var txtKaydol: String? = MyApp.getInstance().resources.getString(R.string.lbl_kaydol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfre: String? = MyApp.getInstance().resources.getString(R.string.lbl_ifre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfrenizimiun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ifrenizi_mi_un)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiriyap: String? = MyApp.getInstance().resources.getString(R.string.lbl_giri_yap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailEditGirisValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSifreGirisValue: String? = null
)
