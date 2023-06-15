package com.bokusapplication.app.modules.daftaralamattwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityDaftarAlamatTwoBinding
import com.bokusapplication.app.modules.daftaralamattwo.`data`.viewmodel.DaftarAlamatTwoVM
import kotlin.String
import kotlin.Unit

class DaftarAlamatTwoActivity :
    BaseActivity<ActivityDaftarAlamatTwoBinding>(R.layout.activity_daftar_alamat_two) {
  private val viewModel: DaftarAlamatTwoVM by viewModels<DaftarAlamatTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.daftarAlamatTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DAFTAR_ALAMAT_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DaftarAlamatTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
