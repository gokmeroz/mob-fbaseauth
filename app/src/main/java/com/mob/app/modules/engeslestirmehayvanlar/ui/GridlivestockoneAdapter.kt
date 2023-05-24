package com.mob.app.modules.engeslestirmehayvanlar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridlivestockoneBinding
import com.mob.app.modules.engeslestirmehayvanlar.`data`.model.GridlivestockoneRowModel
import kotlin.Int
import kotlin.collections.List

class GridlivestockoneAdapter(
  var list: List<GridlivestockoneRowModel>
) : RecyclerView.Adapter<GridlivestockoneAdapter.RowGridlivestockoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlivestockoneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlivestockone,parent,false)
    return RowGridlivestockoneVH(view)
  }

  override fun onBindViewHolder(holder: RowGridlivestockoneVH, position: Int) {
    val gridlivestockoneRowModel = GridlivestockoneRowModel()
    // TODO uncomment following line after integration with data source
    // val gridlivestockoneRowModel = list[position]
    holder.binding.gridlivestockoneRowModel = gridlivestockoneRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridlivestockoneRowModel>) {
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
      item: GridlivestockoneRowModel
    ) {
    }
  }

  inner class RowGridlivestockoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlivestockoneBinding = RowGridlivestockoneBinding.bind(itemView)
  }
}
