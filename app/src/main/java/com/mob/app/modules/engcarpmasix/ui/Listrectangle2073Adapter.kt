package com.mob.app.modules.engcarpmasix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2076Binding
import com.mob.app.modules.engcarpmasix.`data`.model.Listrectangle2076RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2076RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2076VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2076VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2076,parent,false)
    return RowListrectangle2076VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2076VH, position: Int) {
    val listrectangle2076RowModel = Listrectangle2076RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2076RowModel = list[position]
    holder.binding.listrectangle2076RowModel = listrectangle2076RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2076RowModel>) {
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
      item: Listrectangle2076RowModel
    ) {
    }
  }

  inner class RowListrectangle2076VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2076Binding = RowListrectangle2076Binding.bind(itemView)
  }
}
