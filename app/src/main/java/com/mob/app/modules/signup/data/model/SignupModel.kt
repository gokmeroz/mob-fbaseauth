package com.mob.app.modules.signup.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginorSignu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_or_sign_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateapasswo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_passwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameEditValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailEditValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCreatePsSignupValue: String? = null
)
