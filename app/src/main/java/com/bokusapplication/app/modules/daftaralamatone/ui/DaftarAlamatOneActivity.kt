package com.bokusapplication.app.modules.daftaralamatone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityDaftarAlamatOneBinding
import com.bokusapplication.app.modules.daftaralamatone.`data`.viewmodel.DaftarAlamatOneVM
import kotlin.String
import kotlin.Unit

class DaftarAlamatOneActivity :
    BaseActivity<ActivityDaftarAlamatOneBinding>(R.layout.activity_daftar_alamat_one) {
  private val viewModel: DaftarAlamatOneVM by viewModels<DaftarAlamatOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.daftarAlamatOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DAFTAR_ALAMAT_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DaftarAlamatOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
