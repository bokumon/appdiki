package com.bokusapplication.app.modules.daftaralamat.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.bokusapplication.app.R
import com.bokusapplication.app.appcomponents.base.BaseFragment
import com.bokusapplication.app.databinding.FragmentDaftarAlamatBinding
import com.bokusapplication.app.modules.daftaralamat.`data`.model.DaftarAlamatRowModel
import com.bokusapplication.app.modules.daftaralamat.`data`.viewmodel.DaftarAlamatVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DaftarAlamatFragment :
    BaseFragment<FragmentDaftarAlamatBinding>(R.layout.fragment_daftar_alamat) {
  private val viewModel: DaftarAlamatVM by viewModels<DaftarAlamatVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val daftarAlamatAdapter =
    DaftarAlamatAdapter(viewModel.daftarAlamatList.value?:mutableListOf())
    binding.recyclerDaftarAlamat.adapter = daftarAlamatAdapter
    daftarAlamatAdapter.setOnItemClickListener(
    object : DaftarAlamatAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DaftarAlamatRowModel) {
        onClickRecyclerDaftarAlamat(view, position, item)
      }
    }
    )
    viewModel.daftarAlamatList.observe(requireActivity()) {
      daftarAlamatAdapter.updateData(it)
    }
    binding.daftarAlamatVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDaftarAlamat(
    view: View,
    position: Int,
    item: DaftarAlamatRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DAFTAR_ALAMAT_FRAGMENT"


    fun getInstance(bundle: Bundle?): DaftarAlamatFragment {
      val fragment = DaftarAlamatFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
