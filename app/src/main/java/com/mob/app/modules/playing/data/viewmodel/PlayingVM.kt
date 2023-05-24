package com.mob.app.modules.playing.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.playing.`data`.model.PlayingModel
import com.mob.app.modules.playing.`data`.model.PlayingRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PlayingVM : ViewModel(), KoinComponent {
  val playingModel: MutableLiveData<PlayingModel> = MutableLiveData(PlayingModel())

  var navArguments: Bundle? = null

  val playingList: MutableLiveData<MutableList<PlayingRowModel>> = MutableLiveData(mutableListOf())
}
