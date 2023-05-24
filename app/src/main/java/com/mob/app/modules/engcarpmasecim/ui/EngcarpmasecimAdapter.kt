package com.mob.app.modules.engcarpmasecim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngcarpmasecimBinding
import com.mob.app.modules.engcarpmasecim.`data`.model.EngcarpmasecimRowModel
import kotlin.Int
import kotlin.collections.List

class EngcarpmasecimAdapter(
  var list: List<EngcarpmasecimRowModel>
) : RecyclerView.Adapter<EngcarpmasecimAdapter.RowEngcarpmasecimVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngcarpmasecimVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engcarpmasecim,parent,false)
    return RowEngcarpmasecimVH(view)
  }

  override fun onBindViewHolder(holder: RowEngcarpmasecimVH, position: Int) {
    val engcarpmasecimRowModel = EngcarpmasecimRowModel()
    // TODO uncomment following line after integration with data source
    // val engcarpmasecimRowModel = list[position]
    holder.binding.engcarpmasecimRowModel = engcarpmasecimRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngcarpmasecimRowModel>) {
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
      item: EngcarpmasecimRowModel
    ) {
    }
  }

  inner class RowEngcarpmasecimVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngcarpmasecimBinding = RowEngcarpmasecimBinding.bind(itemView)
    init {
      binding.viewRectangle2070.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, EngcarpmasecimRowModel())
      }
      binding.viewRectangle2070One.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, EngcarpmasecimRowModel())
      }
      binding.viewRectangle2070Two.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, EngcarpmasecimRowModel())
      }
    }
  }
}
