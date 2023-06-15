package com.bokusapplication.app.modules.dashboardcontainer.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardContainerModel(
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
