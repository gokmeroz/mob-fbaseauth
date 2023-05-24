package com.mob.app.modules.engeslestirmesayilar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridnumberblocksone1Binding
import com.mob.app.modules.engeslestirmesayilar.`data`.model.Gridnumberblocksone1RowModel
import kotlin.Int
import kotlin.collections.List

class GridnumberblocksoneAdapter(
  var list: List<Gridnumberblocksone1RowModel>
) : RecyclerView.Adapter<GridnumberblocksoneAdapter.RowGridnumberblocksone1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridnumberblocksone1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridnumberblocksone1,parent,false)
    return RowGridnumberblocksone1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridnumberblocksone1VH, position: Int) {
    val gridnumberblocksone1RowModel = Gridnumberblocksone1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridnumberblocksone1RowModel = list[position]
    holder.binding.gridnumberblocksone1RowModel = gridnumberblocksone1RowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridnumberblocksone1RowModel>) {
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
      item: Gridnumberblocksone1RowModel
    ) {
    }
  }

  inner class RowGridnumberblocksone1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridnumberblocksone1Binding = RowGridnumberblocksone1Binding.bind(itemView)
  }
}
