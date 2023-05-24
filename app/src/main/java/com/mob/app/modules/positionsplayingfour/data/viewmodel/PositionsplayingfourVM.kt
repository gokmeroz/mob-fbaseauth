package com.mob.app.modules.positionsplayingfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionsplayingfour.`data`.model.Listbasketballone5RowModel
import com.mob.app.modules.positionsplayingfour.`data`.model.PositionsplayingfourModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PositionsplayingfourVM : ViewModel(), KoinComponent {
  val positionsplayingfourModel: MutableLiveData<PositionsplayingfourModel> =
      MutableLiveData(PositionsplayingfourModel())

  var navArguments: Bundle? = null

  val listbasketballoneList: MutableLiveData<MutableList<Listbasketballone5RowModel>> =
      MutableLiveData(mutableListOf())
}
