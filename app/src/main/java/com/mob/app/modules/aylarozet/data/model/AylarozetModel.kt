package com.mob.app.modules.aylarozet.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class AylarozetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAylarabirdeb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aylara_bir_de_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMAYIS: String? = MyApp.getInstance().resources.getString(R.string.lbl_mayis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHAZRAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_haz_ran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTEMMUZ: String? = MyApp.getInstance().resources.getString(R.string.lbl_temmuz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEYLL: String? = MyApp.getInstance().resources.getString(R.string.lbl_eyl_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEKM: String? = MyApp.getInstance().resources.getString(R.string.lbl_ek_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKASIM: String? = MyApp.getInstance().resources.getString(R.string.lbl_kasim)
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
  var txtOCAK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ocak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUBAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_ubat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMART: String? = MyApp.getInstance().resources.getString(R.string.lbl_mart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNSAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_san)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHadirendikle: String? = MyApp.getInstance().resources.getString(R.string.msg_hadi_rendikle)

)
