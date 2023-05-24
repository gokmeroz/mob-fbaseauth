package com.mob.app.modules.oyun.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowOyunBinding
import com.mob.app.modules.oyun.`data`.model.OyunRowModel
import kotlin.Int
import kotlin.collections.List

class OyunAdapter(
  var list: List<OyunRowModel>
) : RecyclerView.Adapter<OyunAdapter.RowOyunVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOyunVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_oyun,parent,false)
    return RowOyunVH(view)
  }

  override fun onBindViewHolder(holder: RowOyunVH, position: Int) {
    val oyunRowModel = OyunRowModel()
    // TODO uncomment following line after integration with data source
    // val oyunRowModel = list[position]
    holder.binding.oyunRowModel = oyunRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OyunRowModel>) {
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
      item: OyunRowModel
    ) {
    }
  }

  inner class RowOyunVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOyunBinding = RowOyunBinding.bind(itemView)
    init {
      binding.imageRectangle2046.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, OyunRowModel())
      }
    }
  }
}
