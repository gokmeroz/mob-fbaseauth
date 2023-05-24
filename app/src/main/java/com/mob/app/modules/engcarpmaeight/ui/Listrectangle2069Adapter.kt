package com.mob.app.modules.engcarpmaeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2072Binding
import com.mob.app.modules.engcarpmaeight.`data`.model.Listrectangle2072RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2072RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2072VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2072VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2072,parent,false)
    return RowListrectangle2072VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2072VH, position: Int) {
    val listrectangle2072RowModel = Listrectangle2072RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2072RowModel = list[position]
    holder.binding.listrectangle2072RowModel = listrectangle2072RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2072RowModel>) {
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
      item: Listrectangle2072RowModel
    ) {
    }
  }

  inner class RowListrectangle2072VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2072Binding = RowListrectangle2072Binding.bind(itemView)
  }
}
