package com.mob.app.modules.learning.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class LearningModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetslearnsom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_learn_som)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLEARNING: String? = MyApp.getInstance().resources.getString(R.string.lbl_learning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPLAYING: String? = MyApp.getInstance().resources.getString(R.string.lbl_playing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)

)
