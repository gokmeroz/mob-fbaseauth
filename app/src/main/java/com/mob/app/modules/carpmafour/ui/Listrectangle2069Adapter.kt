package com.mob.app.modules.carpmafour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2082Binding
import com.mob.app.modules.carpmafour.`data`.model.Listrectangle2082RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2082RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2082VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2082VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2082,parent,false)
    return RowListrectangle2082VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2082VH, position: Int) {
    val listrectangle2082RowModel = Listrectangle2082RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2082RowModel = list[position]
    holder.binding.listrectangle2082RowModel = listrectangle2082RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2082RowModel>) {
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
      item: Listrectangle2082RowModel
    ) {
    }
  }

  inner class RowListrectangle2082VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2082Binding = RowListrectangle2082Binding.bind(itemView)
  }
}
