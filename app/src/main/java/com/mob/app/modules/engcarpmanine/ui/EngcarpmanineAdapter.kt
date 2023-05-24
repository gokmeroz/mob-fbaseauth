package com.mob.app.modules.engcarpmanine.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEngcarpmanineBinding
import com.mob.app.modules.engcarpmanine.`data`.model.EngcarpmanineRowModel
import kotlin.Int
import kotlin.collections.List

class EngcarpmanineAdapter(
  var list: List<EngcarpmanineRowModel>
) : RecyclerView.Adapter<EngcarpmanineAdapter.RowEngcarpmanineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEngcarpmanineVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_engcarpmanine,parent,false)
    return RowEngcarpmanineVH(view)
  }

  override fun onBindViewHolder(holder: RowEngcarpmanineVH, position: Int) {
    val engcarpmanineRowModel = EngcarpmanineRowModel()
    // TODO uncomment following line after integration with data source
    // val engcarpmanineRowModel = list[position]
    holder.binding.engcarpmanineRowModel = engcarpmanineRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EngcarpmanineRowModel>) {
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
      item: EngcarpmanineRowModel
    ) {
    }
  }

  inner class RowEngcarpmanineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEngcarpmanineBinding = RowEngcarpmanineBinding.bind(itemView)
  }
}
