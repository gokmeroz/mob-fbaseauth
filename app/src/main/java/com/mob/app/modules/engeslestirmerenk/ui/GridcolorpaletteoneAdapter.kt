package com.mob.app.modules.engeslestirmerenk.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowGridcolorpaletteoneBinding
import com.mob.app.modules.engeslestirmerenk.`data`.model.GridcolorpaletteoneRowModel
import kotlin.Int
import kotlin.collections.List

class GridcolorpaletteoneAdapter(
  var list: List<GridcolorpaletteoneRowModel>
) : RecyclerView.Adapter<GridcolorpaletteoneAdapter.RowGridcolorpaletteoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridcolorpaletteoneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridcolorpaletteone,parent,false)
    return RowGridcolorpaletteoneVH(view)
  }

  override fun onBindViewHolder(holder: RowGridcolorpaletteoneVH, position: Int) {
    val gridcolorpaletteoneRowModel = GridcolorpaletteoneRowModel()
    // TODO uncomment following line after integration with data source
    // val gridcolorpaletteoneRowModel = list[position]
    holder.binding.gridcolorpaletteoneRowModel = gridcolorpaletteoneRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridcolorpaletteoneRowModel>) {
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
      item: GridcolorpaletteoneRowModel
    ) {
    }
  }

  inner class RowGridcolorpaletteoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridcolorpaletteoneBinding = RowGridcolorpaletteoneBinding.bind(itemView)
  }
}
