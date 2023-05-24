package com.mob.app.modules.carpmaone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2078Binding
import com.mob.app.modules.carpmaone.`data`.model.Listrectangle2078RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2073Adapter(
  var list: List<Listrectangle2078RowModel>
) : RecyclerView.Adapter<Listrectangle2073Adapter.RowListrectangle2078VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2078VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2078,parent,false)
    return RowListrectangle2078VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2078VH, position: Int) {
    val listrectangle2078RowModel = Listrectangle2078RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2078RowModel = list[position]
    holder.binding.listrectangle2078RowModel = listrectangle2078RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2078RowModel>) {
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
      item: Listrectangle2078RowModel
    ) {
    }
  }

  inner class RowListrectangle2078VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2078Binding = RowListrectangle2078Binding.bind(itemView)
  }
}
