package com.mob.app.modules.write.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class WriteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOkbutonunabas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ok_butonuna_bas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontroledelim: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kontrol_edelim2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSayAnimasyonuThreeValue: String? = null
)
