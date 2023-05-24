package com.mob.app.modules.engcarpmaeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2077Binding
import com.mob.app.modules.engcarpmaeight.`data`.model.Listrectangle2077RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2077RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2077VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2077VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2077,parent,false)
    return RowListrectangle2077VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2077VH, position: Int) {
    val listrectangle2077RowModel = Listrectangle2077RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2077RowModel = list[position]
    holder.binding.listrectangle2077RowModel = listrectangle2077RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2077RowModel>) {
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
      item: Listrectangle2077RowModel
    ) {
    }
  }

  inner class RowListrectangle2077VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2077Binding = RowListrectangle2077Binding.bind(itemView)
  }
}
