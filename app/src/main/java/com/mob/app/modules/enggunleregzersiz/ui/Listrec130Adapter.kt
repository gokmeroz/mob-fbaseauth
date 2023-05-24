package com.mob.app.modules.enggunleregzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrec130Binding
import com.mob.app.modules.enggunleregzersiz.`data`.model.Listrec130RowModel
import kotlin.Int
import kotlin.collections.List

class Listrec130Adapter(
  var list: List<Listrec130RowModel>
) : RecyclerView.Adapter<Listrec130Adapter.RowListrec130VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrec130VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrec130,parent,false)
    return RowListrec130VH(view)
  }

  override fun onBindViewHolder(holder: RowListrec130VH, position: Int) {
    val listrec130RowModel = Listrec130RowModel()
    // TODO uncomment following line after integration with data source
    // val listrec130RowModel = list[position]
    holder.binding.listrec130RowModel = listrec130RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrec130RowModel>) {
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
      item: Listrec130RowModel
    ) {
    }
  }

  inner class RowListrec130VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrec130Binding = RowListrec130Binding.bind(itemView)
  }
}
