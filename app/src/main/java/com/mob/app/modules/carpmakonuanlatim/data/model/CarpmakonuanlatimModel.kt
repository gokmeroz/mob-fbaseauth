package com.mob.app.modules.carpmakonuanlatim.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class CarpmakonuanlatimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArpmailemini: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arpma_i_lemini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInde3tanee: String? = MyApp.getInstance().resources.getString(R.string.msg_inde_3_tane_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYukardasorula: String? =
      MyApp.getInstance().resources.getString(R.string.msg_yukar_da_sorula)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSEPETLER: String? = MyApp.getInstance().resources.getString(R.string.lbl_sepetler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSEPETTEBULUNAN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sepette_bulunan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3XThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_1_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3XTwentySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_2_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3XThirtyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_3_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3X412: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_x_4_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4sepettetopla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_sepette_topla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHadirendikle: String? = MyApp.getInstance().resources.getString(R.string.msg_hadi_rendikle)

)
