package com.mob.app.modules.carpmakonuanlatim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListapplethreeTwo1Binding
import com.mob.app.modules.carpmakonuanlatim.`data`.model.ListapplethreeTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListapplethreeTwoAdapter(
  var list: List<ListapplethreeTwo1RowModel>
) : RecyclerView.Adapter<ListapplethreeTwoAdapter.RowListapplethreeTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListapplethreeTwo1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listapplethree_two1,parent,false)
    return RowListapplethreeTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListapplethreeTwo1VH, position: Int) {
    val listapplethreeTwo1RowModel = ListapplethreeTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listapplethreeTwo1RowModel = list[position]
    holder.binding.listapplethreeTwo1RowModel = listapplethreeTwo1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListapplethreeTwo1RowModel>) {
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
      item: ListapplethreeTwo1RowModel
    ) {
    }
  }

  inner class RowListapplethreeTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListapplethreeTwo1Binding = RowListapplethreeTwo1Binding.bind(itemView)
  }
}
