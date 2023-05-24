package com.mob.app.modules.enghizliokumatanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enghizliokumatanitim.`data`.model.EnghizliokumatanitimModel
import org.koin.core.KoinComponent

class EnghizliokumatanitimVM : ViewModel(), KoinComponent {
  val enghizliokumatanitimModel: MutableLiveData<EnghizliokumatanitimModel> =
      MutableLiveData(EnghizliokumatanitimModel())

  var navArguments: Bundle? = null
}
