package com.mob.app.modules.saategzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowSaategzersizBinding
import com.mob.app.modules.saategzersiz.`data`.model.SaategzersizRowModel
import kotlin.Int
import kotlin.collections.List

class SaategzersizAdapter(
  var list: List<SaategzersizRowModel>
) : RecyclerView.Adapter<SaategzersizAdapter.RowSaategzersizVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSaategzersizVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_saategzersiz,parent,false)
    return RowSaategzersizVH(view)
  }

  override fun onBindViewHolder(holder: RowSaategzersizVH, position: Int) {
    val saategzersizRowModel = SaategzersizRowModel()
    // TODO uncomment following line after integration with data source
    // val saategzersizRowModel = list[position]
    holder.binding.saategzersizRowModel = saategzersizRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SaategzersizRowModel>) {
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
      item: SaategzersizRowModel
    ) {
    }
  }

  inner class RowSaategzersizVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSaategzersizBinding = RowSaategzersizBinding.bind(itemView)
  }
}
