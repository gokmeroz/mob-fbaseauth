package com.mob.app.modules.engcarpmathree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngcarpmathreeBinding
import com.mob.app.modules.engcarpmathree.`data`.model.EngcarpmathreeRowModel
import kotlin.Int
import kotlin.collections.List

class EngcarpmathreeAdapter(
  var list: List<EngcarpmathreeRowModel>
) : RecyclerView.Adapter<EngcarpmathreeAdapter.RowEngcarpmathreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngcarpmathreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engcarpmathree,parent,false)
    return RowEngcarpmathreeVH(view)
  }

  override fun onBindViewHolder(holder: RowEngcarpmathreeVH, position: Int) {
    val engcarpmathreeRowModel = EngcarpmathreeRowModel()
    // TODO uncomment following line after integration with data source
    // val engcarpmathreeRowModel = list[position]
    holder.binding.engcarpmathreeRowModel = engcarpmathreeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngcarpmathreeRowModel>) {
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
      item: EngcarpmathreeRowModel
    ) {
    }
  }

  inner class RowEngcarpmathreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngcarpmathreeBinding = RowEngcarpmathreeBinding.bind(itemView)
  }
}
