package com.mob.app.modules.gunleregzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2062Binding
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2062RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2062Adapter(
  var list: List<Listrectangle2062RowModel>
) : RecyclerView.Adapter<Listrectangle2062Adapter.RowListrectangle2062VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2062VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2062,parent,false)
    return RowListrectangle2062VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2062VH, position: Int) {
    val listrectangle2062RowModel = Listrectangle2062RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2062RowModel = list[position]
    holder.binding.listrectangle2062RowModel = listrectangle2062RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2062RowModel>) {
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
      item: Listrectangle2062RowModel
    ) {
    }
  }

  inner class RowListrectangle2062VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2062Binding = RowListrectangle2062Binding.bind(itemView)
  }
}
