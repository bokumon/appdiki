package com.bokusapplication.app.modules.kontakperson.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.kontakperson.`data`.model.KontakPersonModel
import org.koin.core.KoinComponent

class KontakPersonVM : ViewModel(), KoinComponent {
  val kontakPersonModel: MutableLiveData<KontakPersonModel> = MutableLiveData(KontakPersonModel())

  var navArguments: Bundle? = null
}
