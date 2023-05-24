package com.mob.app.modules.skortablo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowSkortabloBinding
import com.mob.app.modules.skortablo.`data`.model.SkortabloRowModel
import kotlin.Int
import kotlin.collections.List

class SkortabloAdapter(
  var list: List<SkortabloRowModel>
) : RecyclerView.Adapter<SkortabloAdapter.RowSkortabloVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSkortabloVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_skortablo,parent,false)
    return RowSkortabloVH(view)
  }

  override fun onBindViewHolder(holder: RowSkortabloVH, position: Int) {
    val skortabloRowModel = SkortabloRowModel()
    // TODO uncomment following line after integration with data source
    // val skortabloRowModel = list[position]
    holder.binding.skortabloRowModel = skortabloRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SkortabloRowModel>) {
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
      item: SkortabloRowModel
    ) {
    }
  }

  inner class RowSkortabloVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSkortabloBinding = RowSkortabloBinding.bind(itemView)
  }
}
