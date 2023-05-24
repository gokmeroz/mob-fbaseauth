package com.mob.app.modules.carpmathree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowCarpmathreeBinding
import com.mob.app.modules.carpmathree.`data`.model.CarpmathreeRowModel
import kotlin.Int
import kotlin.collections.List

class CarpmathreeAdapter(
  var list: List<CarpmathreeRowModel>
) : RecyclerView.Adapter<CarpmathreeAdapter.RowCarpmathreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarpmathreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_carpmathree,parent,false)
    return RowCarpmathreeVH(view)
  }

  override fun onBindViewHolder(holder: RowCarpmathreeVH, position: Int) {
    val carpmathreeRowModel = CarpmathreeRowModel()
    // TODO uncomment following line after integration with data source
    // val carpmathreeRowModel = list[position]
    holder.binding.carpmathreeRowModel = carpmathreeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarpmathreeRowModel>) {
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
      item: CarpmathreeRowModel
    ) {
    }
  }

  inner class RowCarpmathreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarpmathreeBinding = RowCarpmathreeBinding.bind(itemView)
  }
}
