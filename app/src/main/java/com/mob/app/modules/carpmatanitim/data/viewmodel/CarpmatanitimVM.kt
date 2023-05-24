package com.mob.app.modules.carpmatanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmatanitim.`data`.model.CarpmatanitimModel
import org.koin.core.KoinComponent

class CarpmatanitimVM : ViewModel(), KoinComponent {
  val carpmatanitimModel: MutableLiveData<CarpmatanitimModel> =
      MutableLiveData(CarpmatanitimModel())

  var navArguments: Bundle? = null
}
