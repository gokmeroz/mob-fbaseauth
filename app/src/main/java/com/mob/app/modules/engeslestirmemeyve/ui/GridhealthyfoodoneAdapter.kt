package com.mob.app.modules.engeslestirmemeyve.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridhealthyfoodoneBinding
import com.mob.app.modules.engeslestirmemeyve.`data`.model.GridhealthyfoodoneRowModel
import kotlin.Int
import kotlin.collections.List

class GridhealthyfoodoneAdapter(
  var list: List<GridhealthyfoodoneRowModel>
) : RecyclerView.Adapter<GridhealthyfoodoneAdapter.RowGridhealthyfoodoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridhealthyfoodoneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridhealthyfoodone,parent,false)
    return RowGridhealthyfoodoneVH(view)
  }

  override fun onBindViewHolder(holder: RowGridhealthyfoodoneVH, position: Int) {
    val gridhealthyfoodoneRowModel = GridhealthyfoodoneRowModel()
    // TODO uncomment following line after integration with data source
    // val gridhealthyfoodoneRowModel = list[position]
    holder.binding.gridhealthyfoodoneRowModel = gridhealthyfoodoneRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridhealthyfoodoneRowModel>) {
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
      item: GridhealthyfoodoneRowModel
    ) {
    }
  }

  inner class RowGridhealthyfoodoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridhealthyfoodoneBinding = RowGridhealthyfoodoneBinding.bind(itemView)
  }
}
