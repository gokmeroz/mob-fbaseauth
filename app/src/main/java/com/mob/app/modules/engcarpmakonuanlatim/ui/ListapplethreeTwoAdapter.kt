package com.mob.app.modules.engcarpmakonuanlatim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListapplethreeTwoBinding
import com.mob.app.modules.engcarpmakonuanlatim.`data`.model.ListapplethreeTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListapplethreeTwoAdapter(
  var list: List<ListapplethreeTwoRowModel>
) : RecyclerView.Adapter<ListapplethreeTwoAdapter.RowListapplethreeTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListapplethreeTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listapplethree_two,parent,false)
    return RowListapplethreeTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListapplethreeTwoVH, position: Int) {
    val listapplethreeTwoRowModel = ListapplethreeTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listapplethreeTwoRowModel = list[position]
    holder.binding.listapplethreeTwoRowModel = listapplethreeTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListapplethreeTwoRowModel>) {
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
      item: ListapplethreeTwoRowModel
    ) {
    }
  }

  inner class RowListapplethreeTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListapplethreeTwoBinding = RowListapplethreeTwoBinding.bind(itemView)
  }
}
