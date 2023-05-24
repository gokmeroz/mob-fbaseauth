package com.mob.app.modules.engpositionsplayintwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListbasketballone1Binding
import com.mob.app.modules.engpositionsplayintwo.`data`.model.Listbasketballone1RowModel
import kotlin.Int
import kotlin.collections.List

class ListbasketballoneAdapter(
  var list: List<Listbasketballone1RowModel>
) : RecyclerView.Adapter<ListbasketballoneAdapter.RowListbasketballone1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbasketballone1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbasketballone1,parent,false)
    return RowListbasketballone1VH(view)
  }

  override fun onBindViewHolder(holder: RowListbasketballone1VH, position: Int) {
    val listbasketballone1RowModel = Listbasketballone1RowModel()
    // TODO uncomment following line after integration with data source
    // val listbasketballone1RowModel = list[position]
    holder.binding.listbasketballone1RowModel = listbasketballone1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbasketballone1RowModel>) {
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
      item: Listbasketballone1RowModel
    ) {
    }
  }

  inner class RowListbasketballone1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbasketballone1Binding = RowListbasketballone1Binding.bind(itemView)
    init {
      binding.frameStackbasketballone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone1RowModel())
      }
      binding.frameStackbasketballthree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone1RowModel())
      }
    }
  }
}
