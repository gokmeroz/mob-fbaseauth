package com.mob.app.modules.eslestirmesecim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridnumberblocksone2Binding
import com.mob.app.modules.eslestirmesecim.`data`.model.Gridnumberblocksone2RowModel
import kotlin.Int
import kotlin.collections.List

class GridnumberblocksoneAdapter(
  var list: List<Gridnumberblocksone2RowModel>
) : RecyclerView.Adapter<GridnumberblocksoneAdapter.RowGridnumberblocksone2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridnumberblocksone2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridnumberblocksone2,parent,false)
    return RowGridnumberblocksone2VH(view)
  }


  override fun onBindViewHolder(holder: RowGridnumberblocksone2VH, position: Int) {
    val gridnumberblocksone2RowModel = Gridnumberblocksone2RowModel()
    // TODO uncomment following line after integration with data source
    // val gridnumberblocksone2RowModel = list[position]
    holder.binding.gridnumberblocksone2RowModel = gridnumberblocksone2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridnumberblocksone2RowModel>) {
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
      item: Gridnumberblocksone2RowModel
    ) {
    }
  }

  inner class RowGridnumberblocksone2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridnumberblocksone2Binding = RowGridnumberblocksone2Binding.bind(itemView)
    init {
      binding.frameStacknumberblocksone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridnumberblocksone2RowModel())
      }
    }
  }
}
