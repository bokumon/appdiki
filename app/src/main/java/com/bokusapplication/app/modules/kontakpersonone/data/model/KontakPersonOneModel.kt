package com.bokusapplication.app.modules.kontakpersonone.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KontakPersonOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloUseru: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_user_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontakPerson: String? = MyApp.getInstance().resources.getString(R.string.lbl_kontak_person)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPusatSolSepat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pusat_sol_sepat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_jenderal_su)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSolsepatutauf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sol_sepatu_tauf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jl_gajah_mada)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLAUNDRYDANSOL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laundry_dan_sol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jl_tj_pura_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSolSepatu: String? = MyApp.getInstance().resources.getString(R.string.lbl_sol_sepatu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jl_soekarno_ha)

)
