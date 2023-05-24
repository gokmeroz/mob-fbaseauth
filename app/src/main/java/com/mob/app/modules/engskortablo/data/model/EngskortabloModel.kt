package com.mob.app.modules.engskortablo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EngskortabloModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourtotalgold: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_total_gold)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPERSON: String? = MyApp.getInstance().resources.getString(R.string.lbl_person)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSCORE: String? = MyApp.getInstance().resources.getString(R.string.lbl_score)

)
