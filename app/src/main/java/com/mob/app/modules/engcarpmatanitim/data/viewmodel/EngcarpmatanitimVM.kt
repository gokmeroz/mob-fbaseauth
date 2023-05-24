package com.mob.app.modules.engcarpmatanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmatanitim.`data`.model.EngcarpmatanitimModel
import org.koin.core.KoinComponent

class EngcarpmatanitimVM : ViewModel(), KoinComponent {
  val engcarpmatanitimModel: MutableLiveData<EngcarpmatanitimModel> =
      MutableLiveData(EngcarpmatanitimModel())

  var navArguments: Bundle? = null
}
