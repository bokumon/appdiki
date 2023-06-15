package com.bokusapplication.app.modules.kontakperson.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseActivity
import com.bokusapplication.app.databinding.ActivityKontakPersonBinding
import com.bokusapplication.app.modules.dashboardone.ui.DashboardOneActivity
import com.bokusapplication.app.modules.kontakperson.`data`.viewmodel.KontakPersonVM
import kotlin.String
import kotlin.Unit

class KontakPersonActivity :
    BaseActivity<ActivityKontakPersonBinding>(R.layout.activity_kontak_person) {
  private val viewModel: KontakPersonVM by viewModels<KontakPersonVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kontakPersonVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuserTwo.setOnClickListener {
      val destIntent = DashboardOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "KONTAK_PERSON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KontakPersonActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
