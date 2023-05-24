package com.mob.app.modules.engpositionsplaying.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListbasketballoneBinding
import com.mob.app.modules.engpositionsplaying.`data`.model.ListbasketballoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListbasketballoneAdapter(
  var list: List<ListbasketballoneRowModel>
) : RecyclerView.Adapter<ListbasketballoneAdapter.RowListbasketballoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbasketballoneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbasketballone,parent,false)
    return RowListbasketballoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListbasketballoneVH, position: Int) {
    val listbasketballoneRowModel = ListbasketballoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listbasketballoneRowModel = list[position]
    holder.binding.listbasketballoneRowModel = listbasketballoneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbasketballoneRowModel>) {
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
      item: ListbasketballoneRowModel
    ) {
    }
  }

  inner class RowListbasketballoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbasketballoneBinding = RowListbasketballoneBinding.bind(itemView)
    init {
      binding.frameStackbasketballone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListbasketballoneRowModel())
      }
      binding.frameStackbasketballthree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListbasketballoneRowModel())
      }
    }
  }
}
