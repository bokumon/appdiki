package com.bokusapplication.app.modules.dashboard.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseFragment
import com.bokusapplication.app.databinding.FragmentDashboardBinding
import com.bokusapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import kotlin.String
import kotlin.Unit

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.dashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DASHBOARD_FRAGMENT"


    fun getInstance(bundle: Bundle?): DashboardFragment {
      val fragment = DashboardFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
