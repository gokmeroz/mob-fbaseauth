package com.mob.app.modules.eslestirmemeyve.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridhealthyfoodone1Binding
import com.mob.app.modules.eslestirmemeyve.`data`.model.Gridhealthyfoodone1RowModel
import kotlin.Int
import kotlin.collections.List

class GridhealthyfoodoneAdapter(
  var list: List<Gridhealthyfoodone1RowModel>
) : RecyclerView.Adapter<GridhealthyfoodoneAdapter.RowGridhealthyfoodone1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridhealthyfoodone1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridhealthyfoodone1,parent,false)
    return RowGridhealthyfoodone1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridhealthyfoodone1VH, position: Int) {
    val gridhealthyfoodone1RowModel = Gridhealthyfoodone1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridhealthyfoodone1RowModel = list[position]
    holder.binding.gridhealthyfoodone1RowModel = gridhealthyfoodone1RowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridhealthyfoodone1RowModel>) {
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
      item: Gridhealthyfoodone1RowModel
    ) {
    }
  }

  inner class RowGridhealthyfoodone1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridhealthyfoodone1Binding = RowGridhealthyfoodone1Binding.bind(itemView)
  }
}
