package com.bokusapplication.app.modules.kontakpersonone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseFragment
import com.bokusapplication.app.databinding.FragmentKontakPersonOneBinding
import com.bokusapplication.app.modules.kontakperson.ui.KontakPersonActivity
import com.bokusapplication.app.modules.kontakpersonone.`data`.viewmodel.KontakPersonOneVM
import kotlin.String
import kotlin.Unit

class KontakPersonOneFragment :
    BaseFragment<FragmentKontakPersonOneBinding>(R.layout.fragment_kontak_person_one) {
  private val viewModel: KontakPersonOneVM by viewModels<KontakPersonOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.kontakPersonOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnpusatsolsepat.setOnClickListener {
      val destIntent = KontakPersonActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "KONTAK_PERSON_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): KontakPersonOneFragment {
      val fragment = KontakPersonOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
