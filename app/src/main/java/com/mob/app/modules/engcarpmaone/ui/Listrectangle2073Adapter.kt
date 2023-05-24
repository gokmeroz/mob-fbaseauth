package com.mob.app.modules.engcarpmaone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2073Binding
import com.mob.app.modules.engcarpmaone.`data`.model.Listrectangle2073RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2073RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2073VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2073VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2073,parent,false)
    return RowListrectangle2073VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2073VH, position: Int) {
    val listrectangle2073RowModel = Listrectangle2073RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2073RowModel = list[position]
    holder.binding.listrectangle2073RowModel = listrectangle2073RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2073RowModel>) {
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
      item: Listrectangle2073RowModel
    ) {
    }
  }

  inner class RowListrectangle2073VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2073Binding = RowListrectangle2073Binding.bind(itemView)
  }
}
