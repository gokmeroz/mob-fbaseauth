package com.mob.app.modules.carpmafive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowCarpmafiveBinding
import com.mob.app.modules.carpmafive.`data`.model.CarpmafiveRowModel
import kotlin.Int
import kotlin.collections.List

class CarpmafiveAdapter(
  var list: List<CarpmafiveRowModel>
) : RecyclerView.Adapter<CarpmafiveAdapter.RowCarpmafiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarpmafiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_carpmafive,parent,false)
    return RowCarpmafiveVH(view)
  }

  override fun onBindViewHolder(holder: RowCarpmafiveVH, position: Int) {
    val carpmafiveRowModel = CarpmafiveRowModel()
    // TODO uncomment following line after integration with data source
    // val carpmafiveRowModel = list[position]
    holder.binding.carpmafiveRowModel = carpmafiveRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarpmafiveRowModel>) {
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
      item: CarpmafiveRowModel
    ) {
    }
  }

  inner class RowCarpmafiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarpmafiveBinding = RowCarpmafiveBinding.bind(itemView)
  }
}
