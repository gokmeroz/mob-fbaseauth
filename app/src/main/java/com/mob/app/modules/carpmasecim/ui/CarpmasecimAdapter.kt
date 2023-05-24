package com.mob.app.modules.carpmasecim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowCarpmasecimBinding
import com.mob.app.modules.carpmasecim.`data`.model.CarpmasecimRowModel
import kotlin.Int
import kotlin.collections.List

class CarpmasecimAdapter(
  var list: List<CarpmasecimRowModel>
) : RecyclerView.Adapter<CarpmasecimAdapter.RowCarpmasecimVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarpmasecimVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_carpmasecim,parent,false)
    return RowCarpmasecimVH(view)
  }

  override fun onBindViewHolder(holder: RowCarpmasecimVH, position: Int) {
    val carpmasecimRowModel = CarpmasecimRowModel()
    // TODO uncomment following line after integration with data source
    // val carpmasecimRowModel = list[position]
    holder.binding.carpmasecimRowModel = carpmasecimRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarpmasecimRowModel>) {
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
      item: CarpmasecimRowModel
    ) {
    }
  }

  inner class RowCarpmasecimVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarpmasecimBinding = RowCarpmasecimBinding.bind(itemView)
    init {
      binding.viewRectangle2070.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CarpmasecimRowModel())
      }
      binding.viewRectangle2070One.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CarpmasecimRowModel())
      }
      binding.viewRectangle2070Two.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CarpmasecimRowModel())
      }
    }
  }
}
