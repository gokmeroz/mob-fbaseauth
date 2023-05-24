package com.mob.app.modules.engsaategzersiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowTypeBinding
import com.mob.app.modules.engsaategzersiz.`data`.model.TypeRowModel
import kotlin.Int
import kotlin.collections.List

class TypeAdapter(
  var list: List<TypeRowModel>
) : RecyclerView.Adapter<TypeAdapter.RowTypeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTypeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_type,parent,false)
    return RowTypeVH(view)
  }

  override fun onBindViewHolder(holder: RowTypeVH, position: Int) {
    val typeRowModel = TypeRowModel()
    // TODO uncomment following line after integration with data source
    // val typeRowModel = list[position]
    holder.binding.typeRowModel = typeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TypeRowModel>) {
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
      item: TypeRowModel
    ) {
    }
  }

  inner class RowTypeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTypeBinding = RowTypeBinding.bind(itemView)
  }
}
