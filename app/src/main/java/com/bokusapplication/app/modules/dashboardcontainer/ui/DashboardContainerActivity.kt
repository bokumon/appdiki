package com.bokusapplication.app.modules.dashboardcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityDashboardContainerBinding
import com.bokusapplication.app.extensions.loadFragment
import com.bokusapplication.app.modules.daftaralamat.ui.DaftarAlamatFragment
import com.bokusapplication.app.modules.dashboard.ui.DashboardFragment
import com.bokusapplication.app.modules.dashboardcontainer.`data`.viewmodel.DashboardContainerVM
import com.bokusapplication.app.modules.dashboardone.ui.DashboardOneActivity
import com.bokusapplication.app.modules.kontakpersonone.ui.KontakPersonOneFragment
import kotlin.String
import kotlin.Unit

class DashboardContainerActivity :
    BaseActivity<ActivityDashboardContainerBinding>(R.layout.activity_dashboard_container) {
  private val viewModel: DashboardContainerVM by viewModels<DashboardContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardContainerVM = viewModel
    val destFragment = DashboardFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = DashboardFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnmenu.setOnClickListener {
      val destFragment = KontakPersonOneFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = KontakPersonOneFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnsearch.setOnClickListener {
      val destFragment = DashboardFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = DashboardFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnuserOne.setOnClickListener {
      val destIntent = DashboardOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnuserOne.setOnClickListener {
      val destFragment = DaftarAlamatFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = DaftarAlamatFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
