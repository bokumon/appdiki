package com.bokusapplication.app.modules.daftaralamat.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.daftaralamat.`data`.model.DaftarAlamatModel
import com.bokusapplication.app.modules.daftaralamat.`data`.model.DaftarAlamatRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DaftarAlamatVM : ViewModel(), KoinComponent {
  val daftarAlamatModel: MutableLiveData<DaftarAlamatModel> = MutableLiveData(DaftarAlamatModel())

  var navArguments: Bundle? = null

  val daftarAlamatList: MutableLiveData<MutableList<DaftarAlamatRowModel>> =
      MutableLiveData(mutableListOf())
}
