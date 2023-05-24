package com.mob.app.modules.gunlerozet.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowListrectangle2080TwoBinding
import com.mob.app.modules.gunlerozet.`data`.model.Listrectangle2080TwoRowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle2080TwoAdapter(
  var list: List<Listrectangle2080TwoRowModel>
) : RecyclerView.Adapter<Listrectangle2080TwoAdapter.RowListrectangle2080TwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle2080TwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle2080_two,parent,false)
    return RowListrectangle2080TwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle2080TwoVH, position: Int) {
    val listrectangle2080TwoRowModel = Listrectangle2080TwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle2080TwoRowModel = list[position]
    holder.binding.listrectangle2080TwoRowModel = listrectangle2080TwoRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle2080TwoRowModel>) {
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
      item: Listrectangle2080TwoRowModel
    ) {
    }
  }

  inner class RowListrectangle2080TwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle2080TwoBinding = RowListrectangle2080TwoBinding.bind(itemView)
  }
}
