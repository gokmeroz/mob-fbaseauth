package com.mob.app.modules.engcarpmafour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2074Binding
import com.mob.app.modules.engcarpmafour.`data`.model.Listrectangle2074RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2074RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2074VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2074VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2074,parent,false)
    return RowListrectangle2074VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2074VH, position: Int) {
    val listrectangle2074RowModel = Listrectangle2074RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2074RowModel = list[position]
    holder.binding.listrectangle2074RowModel = listrectangle2074RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2074RowModel>) {
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
      item: Listrectangle2074RowModel
    ) {
    }
  }

  inner class RowListrectangle2074VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2074Binding = RowListrectangle2074Binding.bind(itemView)
  }
}
