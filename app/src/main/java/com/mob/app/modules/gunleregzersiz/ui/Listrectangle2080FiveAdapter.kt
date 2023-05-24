package com.mob.app.modules.gunleregzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2080FiveBinding
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2080FiveRowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2080FiveAdapter(
  var list: List<Listrectangle2080FiveRowModel>
) : RecyclerView.Adapter<Listrectangle2080FiveAdapter.RowListrectangle2080FiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2080FiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2080_five,parent,false)
    return RowListrectangle2080FiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2080FiveVH, position: Int) {
    val listrectangle2080FiveRowModel = Listrectangle2080FiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2080FiveRowModel = list[position]
    holder.binding.listrectangle2080FiveRowModel = listrectangle2080FiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2080FiveRowModel>) {
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
      item: Listrectangle2080FiveRowModel
    ) {
    }
  }

  inner class RowListrectangle2080FiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2080FiveBinding = RowListrectangle2080FiveBinding.bind(itemView)
  }
}
