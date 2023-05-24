package com.mob.app.modules.positionsplayingtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListbasketballone4Binding
import com.mob.app.modules.positionsplayingtwo.`data`.model.Listbasketballone4RowModel
import kotlin.Int
import kotlin.collections.List

class ListbasketballoneAdapter(
  var list: List<Listbasketballone4RowModel>
) : RecyclerView.Adapter<ListbasketballoneAdapter.RowListbasketballone4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbasketballone4VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbasketballone4,parent,false)
    return RowListbasketballone4VH(view)
  }

  override fun onBindViewHolder(holder: RowListbasketballone4VH, position: Int) {
    val listbasketballone4RowModel = Listbasketballone4RowModel()
    // TODO uncomment following line after integration with data source
    // val listbasketballone4RowModel = list[position]
    holder.binding.listbasketballone4RowModel = listbasketballone4RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbasketballone4RowModel>) {
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
      item: Listbasketballone4RowModel
    ) {
    }
  }

  inner class RowListbasketballone4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbasketballone4Binding = RowListbasketballone4Binding.bind(itemView)
    init {
      binding.frameStackbasketballone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone4RowModel())
      }
      binding.frameStackbasketballthree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone4RowModel())
      }
    }
  }
}
