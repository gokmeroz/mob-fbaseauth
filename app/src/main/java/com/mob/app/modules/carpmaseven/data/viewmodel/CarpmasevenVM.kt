package com.mob.app.modules.carpmaseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmaseven.`data`.model.CarpmasevenModel
import com.mob.app.modules.carpmaseven.`data`.model.CarpmasevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmasevenVM : ViewModel(), KoinComponent {
  val carpmasevenModel: MutableLiveData<CarpmasevenModel> = MutableLiveData(CarpmasevenModel())

  var navArguments: Bundle? = null

  val carpmasevenList: MutableLiveData<MutableList<CarpmasevenRowModel>> =
      MutableLiveData(mutableListOf())
}
