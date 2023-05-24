package com.mob.app.modules.gunlerozet.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2080Binding
import com.mob.app.modules.gunlerozet.`data`.model.Listrectangle2080RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2080Adapter(
  var list: List<Listrectangle2080RowModel>
) : RecyclerView.Adapter<Listrectangle2080Adapter.RowListrectangle2080VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2080VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2080,parent,false)
    return RowListrectangle2080VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2080VH, position: Int) {
    val listrectangle2080RowModel = Listrectangle2080RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2080RowModel = list[position]
    holder.binding.listrectangle2080RowModel = listrectangle2080RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2080RowModel>) {
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
      item: Listrectangle2080RowModel
    ) {
    }
  }

  inner class RowListrectangle2080VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2080Binding = RowListrectangle2080Binding.bind(itemView)
  }
}
