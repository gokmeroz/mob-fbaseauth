package com.mob.app.modules.engcarpmafive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngcarpmafiveBinding
import com.mob.app.modules.engcarpmafive.`data`.model.EngcarpmafiveRowModel
import kotlin.Int
import kotlin.collections.List

class EngcarpmafiveAdapter(
  var list: List<EngcarpmafiveRowModel>
) : RecyclerView.Adapter<EngcarpmafiveAdapter.RowEngcarpmafiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngcarpmafiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engcarpmafive,parent,false)
    return RowEngcarpmafiveVH(view)
  }

  override fun onBindViewHolder(holder: RowEngcarpmafiveVH, position: Int) {
    val engcarpmafiveRowModel = EngcarpmafiveRowModel()
    // TODO uncomment following line after integration with data source
    // val engcarpmafiveRowModel = list[position]
    holder.binding.engcarpmafiveRowModel = engcarpmafiveRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngcarpmafiveRowModel>) {
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
      item: EngcarpmafiveRowModel
    ) {
    }
  }

  inner class RowEngcarpmafiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngcarpmafiveBinding = RowEngcarpmafiveBinding.bind(itemView)
  }
}
