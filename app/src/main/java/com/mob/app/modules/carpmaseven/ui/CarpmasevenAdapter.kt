package com.mob.app.modules.carpmaseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowCarpmasevenBinding
import com.mob.app.modules.carpmaseven.`data`.model.CarpmasevenRowModel
import kotlin.Int
import kotlin.collections.List

class CarpmasevenAdapter(
  var list: List<CarpmasevenRowModel>
) : RecyclerView.Adapter<CarpmasevenAdapter.RowCarpmasevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarpmasevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_carpmaseven,parent,false)
    return RowCarpmasevenVH(view)
  }

  override fun onBindViewHolder(holder: RowCarpmasevenVH, position: Int) {
    val carpmasevenRowModel = CarpmasevenRowModel()
    // TODO uncomment following line after integration with data source
    // val carpmasevenRowModel = list[position]
    holder.binding.carpmasevenRowModel = carpmasevenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarpmasevenRowModel>) {
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
      item: CarpmasevenRowModel
    ) {
    }
  }

  inner class RowCarpmasevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarpmasevenBinding = RowCarpmasevenBinding.bind(itemView)
  }
}
