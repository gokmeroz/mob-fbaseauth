package com.mob.app.modules.engskortablo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngskortabloBinding
import com.mob.app.modules.engskortablo.`data`.model.EngskortabloRowModel
import kotlin.Int
import kotlin.collections.List

class EngskortabloAdapter(
  var list: List<EngskortabloRowModel>
) : RecyclerView.Adapter<EngskortabloAdapter.RowEngskortabloVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngskortabloVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engskortablo,parent,false)
    return RowEngskortabloVH(view)
  }

  override fun onBindViewHolder(holder: RowEngskortabloVH, position: Int) {
    val engskortabloRowModel = EngskortabloRowModel()
    // TODO uncomment following line after integration with data source
    // val engskortabloRowModel = list[position]
    holder.binding.engskortabloRowModel = engskortabloRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngskortabloRowModel>) {
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
      item: EngskortabloRowModel
    ) {
    }
  }

  inner class RowEngskortabloVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngskortabloBinding = RowEngskortabloBinding.bind(itemView)
  }
}
