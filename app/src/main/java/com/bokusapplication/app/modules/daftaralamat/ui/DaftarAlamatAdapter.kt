package com.bokusapplication.app.modules.daftaralamat.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bokusapplication.app.R
import com.bokusapplication.app.databinding.RowDaftarAlamatBinding
import com.bokusapplication.app.modules.daftaralamat.`data`.model.DaftarAlamatRowModel
import kotlin.Int
import kotlin.collections.List

class DaftarAlamatAdapter(
  var list: List<DaftarAlamatRowModel>
) : RecyclerView.Adapter<DaftarAlamatAdapter.RowDaftarAlamatVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDaftarAlamatVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_daftar_alamat,parent,false)
    return RowDaftarAlamatVH(view)
  }

  override fun onBindViewHolder(holder: RowDaftarAlamatVH, position: Int) {
    val daftarAlamatRowModel = DaftarAlamatRowModel()
    // TODO uncomment following line after integration with data source
    // val daftarAlamatRowModel = list[position]
    holder.binding.daftarAlamatRowModel = daftarAlamatRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DaftarAlamatRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DaftarAlamatRowModel
    ) {
    }
  }

  inner class RowDaftarAlamatVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDaftarAlamatBinding = RowDaftarAlamatBinding.bind(itemView)
  }
}
