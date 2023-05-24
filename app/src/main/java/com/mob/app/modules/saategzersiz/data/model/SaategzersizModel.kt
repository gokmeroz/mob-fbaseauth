package com.mob.app.modules.saategzersiz.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SaategzersizModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAadakianalo: String? = MyApp.getInstance().resources.getString(R.string.msg_a_a_daki_analo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0230: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1115: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0300: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_00)
  , /**
   * TODO Replace with dynamic value
   */
  var txt0645: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)

)
