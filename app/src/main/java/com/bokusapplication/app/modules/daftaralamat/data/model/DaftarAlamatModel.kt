package com.bokusapplication.app.modules.daftaralamat.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DaftarAlamatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloUseru: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_user_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBIodata: String? = MyApp.getInstance().resources.getString(R.string.lbl_biodata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenisKelamin: String? = MyApp.getInstance().resources.getString(R.string.lbl_jenis_kelamin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPria: String? = MyApp.getInstance().resources.getString(R.string.lbl_pria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUbahTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ubah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_someone_email_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUbahThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_ubah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoTelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_telp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_08123xxxxxxxxx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUbahFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_ubah)

)
