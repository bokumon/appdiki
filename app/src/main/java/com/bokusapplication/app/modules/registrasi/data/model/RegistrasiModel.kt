package com.bokusapplication.app.modules.registrasi.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrasiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoTelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_telp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamat: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleNineTwoValue: String? = null
)
