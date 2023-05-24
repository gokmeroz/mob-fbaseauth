package com.mob.app.modules.carpmatwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowCarpmatwoBinding
import com.mob.app.modules.carpmatwo.`data`.model.CarpmatwoRowModel
import kotlin.Int
import kotlin.collections.List

class CarpmatwoAdapter(
  var list: List<CarpmatwoRowModel>
) : RecyclerView.Adapter<CarpmatwoAdapter.RowCarpmatwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarpmatwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_carpmatwo,parent,false)
    return RowCarpmatwoVH(view)
  }

  override fun onBindViewHolder(holder: RowCarpmatwoVH, position: Int) {
    val carpmatwoRowModel = CarpmatwoRowModel()
    // TODO uncomment following line after integration with data source
    // val carpmatwoRowModel = list[position]
    holder.binding.carpmatwoRowModel = carpmatwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarpmatwoRowModel>) {
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
      item: CarpmatwoRowModel
    ) {
    }
  }

  inner class RowCarpmatwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarpmatwoBinding = RowCarpmatwoBinding.bind(itemView)
  }
}
