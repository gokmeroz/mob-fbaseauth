package com.mob.app.modules.carpmasix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2083Binding
import com.mob.app.modules.carpmasix.`data`.model.Listrectangle2083RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2083RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2083VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2083VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2083,parent,false)
    return RowListrectangle2083VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2083VH, position: Int) {
    val listrectangle2083RowModel = Listrectangle2083RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2083RowModel = list[position]
    holder.binding.listrectangle2083RowModel = listrectangle2083RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2083RowModel>) {
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
      item: Listrectangle2083RowModel
    ) {
    }
  }

  inner class RowListrectangle2083VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2083Binding = RowListrectangle2083Binding.bind(itemView)
  }
}
