package com.mob.app.modules.positionsplaying.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionsplaying.`data`.model.Listbasketballone3RowModel
import com.mob.app.modules.positionsplaying.`data`.model.PositionsplayingModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PositionsplayingVM : ViewModel(), KoinComponent {
  val positionsplayingModel: MutableLiveData<PositionsplayingModel> =
      MutableLiveData(PositionsplayingModel())

  var navArguments: Bundle? = null

  val listbasketballoneList: MutableLiveData<MutableList<Listbasketballone3RowModel>> =
      MutableLiveData(mutableListOf())
}
