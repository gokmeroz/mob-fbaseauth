package com.mob.app.modules.engcarpmaone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2069Binding
import com.mob.app.modules.engcarpmaone.`data`.model.Listrectangle2069RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2069RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2069VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2069VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2069,parent,false)
    return RowListrectangle2069VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2069VH, position: Int) {
    val listrectangle2069RowModel = Listrectangle2069RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2069RowModel = list[position]
    holder.binding.listrectangle2069RowModel = listrectangle2069RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2069RowModel>) {
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
      item: Listrectangle2069RowModel
    ) {
    }
  }

  inner class RowListrectangle2069VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2069Binding = RowListrectangle2069Binding.bind(itemView)
  }
}
