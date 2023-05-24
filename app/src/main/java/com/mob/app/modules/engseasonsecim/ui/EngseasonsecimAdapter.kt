package com.mob.app.modules.engseasonsecim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngseasonsecimBinding
import com.mob.app.modules.engseasonsecim.`data`.model.EngseasonsecimRowModel
import kotlin.Int
import kotlin.collections.List

class EngseasonsecimAdapter(
  var list: List<EngseasonsecimRowModel>
) : RecyclerView.Adapter<EngseasonsecimAdapter.RowEngseasonsecimVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngseasonsecimVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engseasonsecim,parent,false)
    return RowEngseasonsecimVH(view)
  }

  override fun onBindViewHolder(holder: RowEngseasonsecimVH, position: Int) {
    val engseasonsecimRowModel = EngseasonsecimRowModel()
    // TODO uncomment following line after integration with data source
    // val engseasonsecimRowModel = list[position]
    holder.binding.engseasonsecimRowModel = engseasonsecimRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngseasonsecimRowModel>) {
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
      item: EngseasonsecimRowModel
    ) {
    }
  }

  inner class RowEngseasonsecimVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngseasonsecimBinding = RowEngseasonsecimBinding.bind(itemView)
    init {
      binding.image48865861.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, EngseasonsecimRowModel())
      }
    }
  }
}
