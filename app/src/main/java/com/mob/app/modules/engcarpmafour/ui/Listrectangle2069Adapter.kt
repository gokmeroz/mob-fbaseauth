package com.mob.app.modules.engcarpmafour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2070Binding
import com.mob.app.modules.engcarpmafour.`data`.model.Listrectangle2070RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2070RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2070VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2070VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2070,parent,false)
    return RowListrectangle2070VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2070VH, position: Int) {
    val listrectangle2070RowModel = Listrectangle2070RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2070RowModel = list[position]
    holder.binding.listrectangle2070RowModel = listrectangle2070RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2070RowModel>) {
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
      item: Listrectangle2070RowModel
    ) {
    }
  }

  inner class RowListrectangle2070VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2070Binding = RowListrectangle2070Binding.bind(itemView)
  }
}
