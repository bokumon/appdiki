package com.bokusapplication.app.modules.dashboardone.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloUseru: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_user_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPusatKontrol: String? = MyApp.getInstance().resources.getString(R.string.lbl_pusat_kontrol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftarAlamat: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar_alamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkun: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun)
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
  var txtUserThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)

)
