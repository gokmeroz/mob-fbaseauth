package com.mob.app.modules.eslestirmehayvanlar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridlivestockone1Binding
import com.mob.app.modules.eslestirmehayvanlar.`data`.model.Gridlivestockone1RowModel
import kotlin.Int
import kotlin.collections.List

class GridlivestockoneAdapter(
  var list: List<Gridlivestockone1RowModel>
) : RecyclerView.Adapter<GridlivestockoneAdapter.RowGridlivestockone1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlivestockone1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlivestockone1,parent,false)
    return RowGridlivestockone1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridlivestockone1VH, position: Int) {
    val gridlivestockone1RowModel = Gridlivestockone1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridlivestockone1RowModel = list[position]
    holder.binding.gridlivestockone1RowModel = gridlivestockone1RowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridlivestockone1RowModel>) {
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
      item: Gridlivestockone1RowModel
    ) {
    }
  }

  inner class RowGridlivestockone1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlivestockone1Binding = RowGridlivestockone1Binding.bind(itemView)
  }
}
