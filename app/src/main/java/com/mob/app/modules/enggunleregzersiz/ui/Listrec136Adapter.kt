package com.mob.app.modules.enggunleregzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrec136Binding
import com.mob.app.modules.enggunleregzersiz.`data`.model.Listrec136RowModel
import kotlin.Int
import kotlin.collections.List

class Listrec136Adapter(
  var list: List<Listrec136RowModel>
) : RecyclerView.Adapter<Listrec136Adapter.RowListrec136VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrec136VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrec136,parent,false)
    return RowListrec136VH(view)
  }

  override fun onBindViewHolder(holder: RowListrec136VH, position: Int) {
    val listrec136RowModel = Listrec136RowModel()
    // TODO uncomment following line after integration with data source
    // val listrec136RowModel = list[position]
    holder.binding.listrec136RowModel = listrec136RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrec136RowModel>) {
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
      item: Listrec136RowModel
    ) {
    }
  }

  inner class RowListrec136VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrec136Binding = RowListrec136Binding.bind(itemView)
  }
}
