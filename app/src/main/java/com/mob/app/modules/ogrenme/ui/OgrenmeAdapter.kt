package com.mob.app.modules.ogrenme.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowOgrenmeBinding
import com.mob.app.modules.ogrenme.`data`.model.OgrenmeRowModel
import kotlin.Int
import kotlin.collections.List

class OgrenmeAdapter(
  var list: List<OgrenmeRowModel>
) : RecyclerView.Adapter<OgrenmeAdapter.RowOgrenmeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOgrenmeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ogrenme,parent,false)
    return RowOgrenmeVH(view)
  }

  override fun onBindViewHolder(holder: RowOgrenmeVH, position: Int) {
    val ogrenmeRowModel = OgrenmeRowModel()
    // TODO uncomment following line after integration with data source
    // val ogrenmeRowModel = list[position]
    holder.binding.ogrenmeRowModel = ogrenmeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OgrenmeRowModel>) {
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
      item: OgrenmeRowModel
    ) {
    }
  }

  inner class RowOgrenmeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOgrenmeBinding = RowOgrenmeBinding.bind(itemView)
    init {
      binding.imageRectangle2046.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, OgrenmeRowModel())
      }
    }
  }
}
