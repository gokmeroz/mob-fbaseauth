package com.mob.app.modules.engpositionsplayingfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListbasketballone2Binding
import com.mob.app.modules.engpositionsplayingfour.`data`.model.Listbasketballone2RowModel
import kotlin.Int
import kotlin.collections.List

class ListbasketballoneAdapter(
  var list: List<Listbasketballone2RowModel>
) : RecyclerView.Adapter<ListbasketballoneAdapter.RowListbasketballone2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbasketballone2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbasketballone2,parent,false)
    return RowListbasketballone2VH(view)
  }

  override fun onBindViewHolder(holder: RowListbasketballone2VH, position: Int) {
    val listbasketballone2RowModel = Listbasketballone2RowModel()
    // TODO uncomment following line after integration with data source
    // val listbasketballone2RowModel = list[position]
    holder.binding.listbasketballone2RowModel = listbasketballone2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbasketballone2RowModel>) {
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
      item: Listbasketballone2RowModel
    ) {
    }
  }

  inner class RowListbasketballone2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbasketballone2Binding = RowListbasketballone2Binding.bind(itemView)
    init {
      binding.frameStackbasketballone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone2RowModel())
      }
      binding.frameStackbasketballthree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbasketballone2RowModel())
      }
    }
  }
}
