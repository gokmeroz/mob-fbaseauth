package com.mob.app.modules.carpmaeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2085Binding
import com.mob.app.modules.carpmaeight.`data`.model.Listrectangle2085RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2085RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2085VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2085VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2085,parent,false)
    return RowListrectangle2085VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2085VH, position: Int) {
    val listrectangle2085RowModel = Listrectangle2085RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2085RowModel = list[position]
    holder.binding.listrectangle2085RowModel = listrectangle2085RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2085RowModel>) {
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
      item: Listrectangle2085RowModel
    ) {
    }
  }

  inner class RowListrectangle2085VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2085Binding = RowListrectangle2085Binding.bind(itemView)
  }
}
