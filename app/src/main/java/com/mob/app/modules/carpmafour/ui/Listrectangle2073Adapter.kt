package com.mob.app.modules.carpmafour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2081Binding
import com.mob.app.modules.carpmafour.`data`.model.Listrectangle2081RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2081RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2081VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2081VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2081,parent,false)
    return RowListrectangle2081VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2081VH, position: Int) {
    val listrectangle2081RowModel = Listrectangle2081RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2081RowModel = list[position]
    holder.binding.listrectangle2081RowModel = listrectangle2081RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2081RowModel>) {
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
      item: Listrectangle2081RowModel
    ) {
    }
  }

  inner class RowListrectangle2081VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2081Binding = RowListrectangle2081Binding.bind(itemView)
  }
}
