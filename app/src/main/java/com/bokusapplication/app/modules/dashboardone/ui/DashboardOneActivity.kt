package com.bokusapplication.app.modules.dashboardone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityDashboardOneBinding
import com.bokusapplication.app.modules.daftaralamatone.ui.DaftarAlamatOneActivity
import com.bokusapplication.app.modules.daftaralamattwo.ui.DaftarAlamatTwoActivity
import com.bokusapplication.app.modules.dashboardone.`data`.viewmodel.DashboardOneVM
import kotlin.String
import kotlin.Unit

class DashboardOneActivity :
    BaseActivity<ActivityDashboardOneBinding>(R.layout.activity_dashboard_one) {
  private val viewModel: DashboardOneVM by viewModels<DashboardOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtrash.setOnClickListener {
      val destIntent = DaftarAlamatOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowlocation.setOnClickListener {
      val destIntent = DaftarAlamatTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
