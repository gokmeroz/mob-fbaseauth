package com.mob.app.modules.hizliokumatanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.hizliokumatanitim.`data`.model.HizliokumatanitimModel
import org.koin.core.KoinComponent

class HizliokumatanitimVM : ViewModel(), KoinComponent {
  val hizliokumatanitimModel: MutableLiveData<HizliokumatanitimModel> =
      MutableLiveData(HizliokumatanitimModel())

  var navArguments: Bundle? = null
}
