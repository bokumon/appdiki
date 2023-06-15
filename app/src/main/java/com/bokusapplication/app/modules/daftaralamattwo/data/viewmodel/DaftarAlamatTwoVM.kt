package com.bokusapplication.app.modules.daftaralamattwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.daftaralamattwo.`data`.model.DaftarAlamatTwoModel
import org.koin.core.KoinComponent

class DaftarAlamatTwoVM : ViewModel(), KoinComponent {
  val daftarAlamatTwoModel: MutableLiveData<DaftarAlamatTwoModel> =
      MutableLiveData(DaftarAlamatTwoModel())

  var navArguments: Bundle? = null
}
