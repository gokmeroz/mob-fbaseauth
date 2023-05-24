package com.mob.app.modules.learning.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowLearningBinding
import com.mob.app.modules.learning.`data`.model.LearningRowModel
import kotlin.Int
import kotlin.collections.List

class LearningAdapter(
  var list: List<LearningRowModel>
) : RecyclerView.Adapter<LearningAdapter.RowLearningVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLearningVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_learning,parent,false)
    return RowLearningVH(view)
  }

  override fun onBindViewHolder(holder: RowLearningVH, position: Int) {
    val learningRowModel = LearningRowModel()
    // TODO uncomment following line after integration with data source
    // val learningRowModel = list[position]
    holder.binding.learningRowModel = learningRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LearningRowModel>) {
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
      item: LearningRowModel
    ) {
    }
  }

  inner class RowLearningVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLearningBinding = RowLearningBinding.bind(itemView)
    init {
      binding.imageDigitL.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, LearningRowModel())
      }
    }
  }
}
