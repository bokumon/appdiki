package com.bokusapplication.app.modules.daftaralamatone.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DaftarAlamatOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloUseru: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_user_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactPerson: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_person)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJlGajahMada: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_gajah_mada2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEksplor: String? = MyApp.getInstance().resources.getString(R.string.lbl_eksplor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontak: String? = MyApp.getInstance().resources.getString(R.string.lbl_kontak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)

)
