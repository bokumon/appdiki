package com.bokusapplication.app.modules.daftaralamatone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.daftaralamatone.`data`.model.DaftarAlamatOneModel
import org.koin.core.KoinComponent

class DaftarAlamatOneVM : ViewModel(), KoinComponent {
  val daftarAlamatOneModel: MutableLiveData<DaftarAlamatOneModel> =
      MutableLiveData(DaftarAlamatOneModel())

  var navArguments: Bundle? = null
}
