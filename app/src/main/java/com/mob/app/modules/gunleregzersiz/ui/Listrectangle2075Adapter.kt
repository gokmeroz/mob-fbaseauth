package com.mob.app.modules.gunleregzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2075Binding
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2075RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2075Adapter(
  var list: List<Listrectangle2075RowModel>
) : RecyclerView.Adapter<Listrectangle2075Adapter.RowListrectangle2075VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2075VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2075,parent,false)
    return RowListrectangle2075VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2075VH, position: Int) {
    val listrectangle2075RowModel = Listrectangle2075RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2075RowModel = list[position]
    holder.binding.listrectangle2075RowModel = listrectangle2075RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2075RowModel>) {
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
      item: Listrectangle2075RowModel
    ) {
    }
  }

  inner class RowListrectangle2075VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2075Binding = RowListrectangle2075Binding.bind(itemView)
  }
}
