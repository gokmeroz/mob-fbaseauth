package com.mob.app.modules.engcarpmatwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngcarpmatwoBinding
import com.mob.app.modules.engcarpmatwo.`data`.model.EngcarpmatwoRowModel
import kotlin.Int
import kotlin.collections.List

class EngcarpmatwoAdapter(
  var list: List<EngcarpmatwoRowModel>
) : RecyclerView.Adapter<EngcarpmatwoAdapter.RowEngcarpmatwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngcarpmatwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engcarpmatwo,parent,false)
    return RowEngcarpmatwoVH(view)
  }

  override fun onBindViewHolder(holder: RowEngcarpmatwoVH, position: Int) {
    val engcarpmatwoRowModel = EngcarpmatwoRowModel()
    // TODO uncomment following line after integration with data source
    // val engcarpmatwoRowModel = list[position]
    holder.binding.engcarpmatwoRowModel = engcarpmatwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngcarpmatwoRowModel>) {
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
      item: EngcarpmatwoRowModel
    ) {
    }
  }

  inner class RowEngcarpmatwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngcarpmatwoBinding = RowEngcarpmatwoBinding.bind(itemView)
  }
}
