package com.bokusapplication.app.modules.kontakpersonone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bokusapplication.app.modules.kontakpersonone.`data`.model.KontakPersonOneModel
import org.koin.core.KoinComponent

class KontakPersonOneVM : ViewModel(), KoinComponent {
  val kontakPersonOneModel: MutableLiveData<KontakPersonOneModel> =
      MutableLiveData(KontakPersonOneModel())

  var navArguments: Bundle? = null
}
