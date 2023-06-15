package com.bokusapplication.app.modules.dashboard.`data`.model

import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloUseru: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_user_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTempatsolsepa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tempat_sol_sepa)

)
