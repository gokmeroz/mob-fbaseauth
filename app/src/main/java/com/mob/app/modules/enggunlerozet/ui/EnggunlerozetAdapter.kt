package com.mob.app.modules.enggunlerozet.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowEnggunlerozetBinding
import com.mob.app.modules.enggunlerozet.`data`.model.EnggunlerozetRowModel
import kotlin.Int
import kotlin.collections.List

class EnggunlerozetAdapter(
  var list: List<EnggunlerozetRowModel>
) : RecyclerView.Adapter<EnggunlerozetAdapter.RowEnggunlerozetVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEnggunlerozetVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_enggunlerozet,parent,false)
    return RowEnggunlerozetVH(view)
  }

  override fun onBindViewHolder(holder: RowEnggunlerozetVH, position: Int) {
    val enggunlerozetRowModel = EnggunlerozetRowModel()
    // TODO uncomment following line after integration with data source
    // val enggunlerozetRowModel = list[position]
    holder.binding.enggunlerozetRowModel = enggunlerozetRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EnggunlerozetRowModel>) {
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
      item: EnggunlerozetRowModel
    ) {
    }
  }

  inner class RowEnggunlerozetVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEnggunlerozetBinding = RowEnggunlerozetBinding.bind(itemView)
  }
}
