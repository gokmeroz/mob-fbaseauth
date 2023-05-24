package com.mob.app.modules.positionsplaying.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListbasketballone3Binding
import com.mob.app.modules.positionsplaying.`data`.model.Listbasketballone3RowModel
import kotlin.Int
import kotlin.collections.List

class ListbasketballoneAdapter(
  var list: List<Listbasketballone3RowModel>
) : RecyclerView.Adapter<ListbasketballoneAdapter.RowListbasketballone3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbasketballone3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbasketballone3,parent,false)
    return RowListbasketballone3VH(view)
  }

  override fun onBindViewHolder(holder: RowListbasketballone3VH, position: Int) {
    val listbasketballone3RowModel = Listbasketballone3RowModel()
    // TODO uncomment following line after integration with data source
    // val listbasketballone3RowModel = list[position]
    holder.binding.listbasketballone3RowModel = listbasketballone3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbasketballone3RowModel>) {
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
      item: Listbasketballone3RowModel
    ) {
    }
  }

  inner class RowListbasketballone3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbasketballone3Binding = RowListbasketballone3Binding.bind(itemView)
    init {
      binding.frameStackbasketballone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone3RowModel())
      }
      binding.frameStackbasketballthree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone3RowModel())
      }
    }
  }
}
