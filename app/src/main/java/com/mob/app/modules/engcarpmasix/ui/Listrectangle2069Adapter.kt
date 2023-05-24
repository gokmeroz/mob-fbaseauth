package com.mob.app.modules.engcarpmasix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2071Binding
import com.mob.app.modules.engcarpmasix.`data`.model.Listrectangle2071RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2071RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2071VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2071VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2071,parent,false)
    return RowListrectangle2071VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2071VH, position: Int) {
    val listrectangle2071RowModel = Listrectangle2071RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2071RowModel = list[position]
    holder.binding.listrectangle2071RowModel = listrectangle2071RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2071RowModel>) {
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
      item: Listrectangle2071RowModel
    ) {
    }
  }

  inner class RowListrectangle2071VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2071Binding = RowListrectangle2071Binding.bind(itemView)
  }
}
