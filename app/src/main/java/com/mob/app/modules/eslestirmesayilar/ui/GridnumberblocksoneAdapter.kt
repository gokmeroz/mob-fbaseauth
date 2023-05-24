package com.mob.app.modules.eslestirmesayilar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridnumberblocksone3Binding
import com.mob.app.modules.eslestirmesayilar.`data`.model.Gridnumberblocksone3RowModel
import kotlin.Int
import kotlin.collections.List

class GridnumberblocksoneAdapter(
  var list: List<Gridnumberblocksone3RowModel>
) : RecyclerView.Adapter<GridnumberblocksoneAdapter.RowGridnumberblocksone3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridnumberblocksone3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridnumberblocksone3,parent,false)
    return RowGridnumberblocksone3VH(view)
  }

  override fun onBindViewHolder(holder: RowGridnumberblocksone3VH, position: Int) {
    val gridnumberblocksone3RowModel = Gridnumberblocksone3RowModel()
    // TODO uncomment following line after integration with data source
    // val gridnumberblocksone3RowModel = list[position]
    holder.binding.gridnumberblocksone3RowModel = gridnumberblocksone3RowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridnumberblocksone3RowModel>) {
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
      item: Gridnumberblocksone3RowModel
    ) {
    }
  }

  inner class RowGridnumberblocksone3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridnumberblocksone3Binding = RowGridnumberblocksone3Binding.bind(itemView)
  }
}
