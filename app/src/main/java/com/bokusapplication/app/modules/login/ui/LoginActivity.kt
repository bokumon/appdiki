package com.bokusapplication.app.modules.login.ui

import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityLoginBinding
import com.bokusapplication.app.modules.dashboardcontainer.ui.DashboardContainerActivity
import com.bokusapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.bokusapplication.app.modules.registrasi.ui.RegistrasiActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtDonthaveacco.setOnClickListener {
      val destIntent = RegistrasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMasuk.setOnClickListener {
      val destIntent = DashboardContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"

  }
}
