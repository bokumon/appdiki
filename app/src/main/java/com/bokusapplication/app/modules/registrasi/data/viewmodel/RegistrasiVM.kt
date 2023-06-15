package com.bokusapplication.app.modules.registrasi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.registrasi.`data`.model.RegistrasiModel
import org.koin.core.KoinComponent

class RegistrasiVM : ViewModel(), KoinComponent {
  val registrasiModel: MutableLiveData<RegistrasiModel> = MutableLiveData(RegistrasiModel())

  var navArguments: Bundle? = null
}
