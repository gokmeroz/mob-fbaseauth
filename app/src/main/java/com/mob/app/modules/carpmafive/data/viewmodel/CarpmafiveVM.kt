package com.mob.app.modules.carpmafive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmafive.`data`.model.CarpmafiveModel
import com.mob.app.modules.carpmafive.`data`.model.CarpmafiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmafiveVM : ViewModel(), KoinComponent {
  val carpmafiveModel: MutableLiveData<CarpmafiveModel> = MutableLiveData(CarpmafiveModel())

  var navArguments: Bundle? = null

  val carpmafiveList: MutableLiveData<MutableList<CarpmafiveRowModel>> =
      MutableLiveData(mutableListOf())
}
