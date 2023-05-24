package com.mob.app.modules.enggunleregzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowWeBinding
import com.mob.app.modules.enggunleregzersiz.`data`.model.WeRowModel
import kotlin.Int
import kotlin.collections.List

class WeAdapter(
  var list: List<WeRowModel>
) : RecyclerView.Adapter<WeAdapter.RowWeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowWeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_we,parent,false)
    return RowWeVH(view)
  }

  override fun onBindViewHolder(holder: RowWeVH, position: Int) {
    val weRowModel = WeRowModel()
    // TODO uncomment following line after integration with data source
    // val weRowModel = list[position]
    holder.binding.weRowModel = weRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<WeRowModel>) {
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
      item: WeRowModel
    ) {
    }
  }

  inner class RowWeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowWeBinding = RowWeBinding.bind(itemView)
  }
}
