package com.mob.app.modules.engcarpmaseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngcarpmasevenBinding
import com.mob.app.modules.engcarpmaseven.`data`.model.EngcarpmasevenRowModel
import kotlin.Int
import kotlin.collections.List

class EngcarpmasevenAdapter(
  var list: List<EngcarpmasevenRowModel>
) : RecyclerView.Adapter<EngcarpmasevenAdapter.RowEngcarpmasevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngcarpmasevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engcarpmaseven,parent,false)
    return RowEngcarpmasevenVH(view)
  }

  override fun onBindViewHolder(holder: RowEngcarpmasevenVH, position: Int) {
    val engcarpmasevenRowModel = EngcarpmasevenRowModel()
    // TODO uncomment following line after integration with data source
    // val engcarpmasevenRowModel = list[position]
    holder.binding.engcarpmasevenRowModel = engcarpmasevenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngcarpmasevenRowModel>) {
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
      item: EngcarpmasevenRowModel
    ) {
    }
  }

  inner class RowEngcarpmasevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngcarpmasevenBinding = RowEngcarpmasevenBinding.bind(itemView)
  }
}
