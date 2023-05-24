package com.mob.app.modules.positionsplayingfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListbasketballone5Binding
import com.mob.app.modules.positionsplayingfour.`data`.model.Listbasketballone5RowModel
import kotlin.Int
import kotlin.collections.List

class ListbasketballoneAdapter(
  var list: List<Listbasketballone5RowModel>
) : RecyclerView.Adapter<ListbasketballoneAdapter.RowListbasketballone5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbasketballone5VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbasketballone5,parent,false)
    return RowListbasketballone5VH(view)
  }

  override fun onBindViewHolder(holder: RowListbasketballone5VH, position: Int) {
    val listbasketballone5RowModel = Listbasketballone5RowModel()
    // TODO uncomment following line after integration with data source
    // val listbasketballone5RowModel = list[position]
    holder.binding.listbasketballone5RowModel = listbasketballone5RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbasketballone5RowModel>) {
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
      item: Listbasketballone5RowModel
    ) {
    }
  }

  inner class RowListbasketballone5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbasketballone5Binding = RowListbasketballone5Binding.bind(itemView)
    init {
      binding.frameStackbasketballone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone5RowModel())
      }
      binding.frameStackbasketballthree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone5RowModel())
      }
    }
  }
}
