package com.mob.app.modules.seasonsecim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowSeasonsecimBinding
import com.mob.app.modules.seasonsecim.`data`.model.SeasonsecimRowModel
import kotlin.Int
import kotlin.collections.List

class SeasonsecimAdapter(
  var list: List<SeasonsecimRowModel>
) : RecyclerView.Adapter<SeasonsecimAdapter.RowSeasonsecimVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeasonsecimVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_seasonsecim,parent,false)
    return RowSeasonsecimVH(view)
  }

  override fun onBindViewHolder(holder: RowSeasonsecimVH, position: Int) {
    val seasonsecimRowModel = SeasonsecimRowModel()
    // TODO uncomment following line after integration with data source
    // val seasonsecimRowModel = list[position]
    holder.binding.seasonsecimRowModel = seasonsecimRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SeasonsecimRowModel>) {
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
      item: SeasonsecimRowModel
    ) {
    }
  }

  inner class RowSeasonsecimVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSeasonsecimBinding = RowSeasonsecimBinding.bind(itemView)
    init {
      binding.image48865861.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, SeasonsecimRowModel())
      }
    }
  }
}
