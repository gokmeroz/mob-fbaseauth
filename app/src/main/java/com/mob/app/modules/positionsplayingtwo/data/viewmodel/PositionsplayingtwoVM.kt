package com.mob.app.modules.positionsplayingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionsplayingtwo.`data`.model.Listbasketballone4RowModel
import com.mob.app.modules.positionsplayingtwo.`data`.model.PositionsplayingtwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PositionsplayingtwoVM : ViewModel(), KoinComponent {
  val positionsplayingtwoModel: MutableLiveData<PositionsplayingtwoModel> =
      MutableLiveData(PositionsplayingtwoModel())

  var navArguments: Bundle? = null

  val listbasketballoneList: MutableLiveData<MutableList<Listbasketballone4RowModel>> =
      MutableLiveData(mutableListOf())
}
