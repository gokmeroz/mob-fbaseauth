package com.mob.app.modules.eslestirmerenk.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEslestirmerenkBinding
import com.mob.app.modules.eslestirmerenk.`data`.model.EslestirmerenkRowModel
import kotlin.Int
import kotlin.collections.List

class EslestirmerenkAdapter(
  var list: List<EslestirmerenkRowModel>
) : RecyclerView.Adapter<EslestirmerenkAdapter.RowEslestirmerenkVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEslestirmerenkVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_eslestirmerenk,parent,false)
    return RowEslestirmerenkVH(view)
  }

  override fun onBindViewHolder(holder: RowEslestirmerenkVH, position: Int) {
    val eslestirmerenkRowModel = EslestirmerenkRowModel()
    // TODO uncomment following line after integration with data source
    // val eslestirmerenkRowModel = list[position]
    holder.binding.eslestirmerenkRowModel = eslestirmerenkRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EslestirmerenkRowModel>) {
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
      item: EslestirmerenkRowModel
    ) {
    }
  }

  inner class RowEslestirmerenkVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEslestirmerenkBinding = RowEslestirmerenkBinding.bind(itemView)
  }
}
