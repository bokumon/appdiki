package com.bokusapplication.app.modules.dashboardone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.dashboardone.`data`.model.DashboardOneModel
import org.koin.core.KoinComponent

class DashboardOneVM : ViewModel(), KoinComponent {
  val dashboardOneModel: MutableLiveData<DashboardOneModel> = MutableLiveData(DashboardOneModel())

  var navArguments: Bundle? = null
}
