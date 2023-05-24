package com.mob.app.modules.carpmaone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2079Binding
import com.mob.app.modules.carpmaone.`data`.model.Listrectangle2079RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2069Adapter(
  var list: List<Listrectangle2079RowModel>
) : RecyclerView.Adapter<Listrectangle2069Adapter.RowListrectangle2079VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2079VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2079,parent,false)
    return RowListrectangle2079VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2079VH, position: Int) {
    val listrectangle2079RowModel = Listrectangle2079RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2079RowModel = list[position]
    holder.binding.listrectangle2079RowModel = listrectangle2079RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2079RowModel>) {
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
      item: Listrectangle2079RowModel
    ) {
    }
  }

  inner class RowListrectangle2079VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2079Binding = RowListrectangle2079Binding.bind(itemView)
  }
}
