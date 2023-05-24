package com.mob.app.modules.playing.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mob.app.R
import com.mob.app.databinding.RowPlayingBinding
import com.mob.app.modules.playing.`data`.model.PlayingRowModel
import kotlin.Int
import kotlin.collections.List

class PlayingAdapter(
  var list: List<PlayingRowModel>
) : RecyclerView.Adapter<PlayingAdapter.RowPlayingVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPlayingVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_playing,parent,false)
    return RowPlayingVH(view)
  }

  override fun onBindViewHolder(holder: RowPlayingVH, position: Int) {
    val playingRowModel = PlayingRowModel()
    // TODO uncomment following line after integration with data source
    // val playingRowModel = list[position]
    holder.binding.playingRowModel = playingRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PlayingRowModel>) {
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
      item: PlayingRowModel
    ) {
    }
  }

  inner class RowPlayingVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPlayingBinding = RowPlayingBinding.bind(itemView)
    init {
      binding.imageDigitsP.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PlayingRowModel())
      }
    }
  }
}
