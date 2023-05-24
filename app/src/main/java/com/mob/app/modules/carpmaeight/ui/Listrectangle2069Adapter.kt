package com.mob.app.modules.carpmaeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2086Binding
import com.mob.app.modules.carpmaeight.`data`.model.Listrectangle2086RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2086RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2086VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2086VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2086,parent,false)
    return RowListrectangle2086VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2086VH, position: Int) {
    val listrectangle2086RowModel = Listrectangle2086RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2086RowModel = list[position]
    holder.binding.listrectangle2086RowModel = listrectangle2086RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2086RowModel>) {
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
      item: Listrectangle2086RowModel
    ) {
    }
  }

  inner class RowListrectangle2086VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2086Binding = RowListrectangle2086Binding.bind(itemView)
  }
}
