package com.mob.app.modules.carpmasix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2084Binding
import com.mob.app.modules.carpmasix.`data`.model.Listrectangle2084RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2084RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2084VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2084VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2084,parent,false)
    return RowListrectangle2084VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2084VH, position: Int) {
    val listrectangle2084RowModel = Listrectangle2084RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2084RowModel = list[position]
    holder.binding.listrectangle2084RowModel = listrectangle2084RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2084RowModel>) {
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
      item: Listrectangle2084RowModel
    ) {
    }
  }

  inner class RowListrectangle2084VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2084Binding = RowListrectangle2084Binding.bind(itemView)
  }
}
