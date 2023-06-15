package com.bokusapplication.app.modules.registrasi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityRegistrasiBinding
import com.bokusapplication.app.modules.dashboardcontainer.ui.DashboardContainerActivity
import com.bokusapplication.app.modules.registrasi.`data`.viewmodel.RegistrasiVM
import kotlin.String
import kotlin.Unit

class RegistrasiActivity : BaseActivity<ActivityRegistrasiBinding>(R.layout.activity_registrasi) {
  private val viewModel: RegistrasiVM by viewModels<RegistrasiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrasiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = DashboardContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRASI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrasiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
