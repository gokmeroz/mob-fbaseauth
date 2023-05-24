package com.mob.app.modules.engcarpmasecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmasecim.`data`.model.EngcarpmasecimModel
import com.mob.app.modules.engcarpmasecim.`data`.model.EngcarpmasecimRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmasecimVM : ViewModel(), KoinComponent {
  val engcarpmasecimModel: MutableLiveData<EngcarpmasecimModel> =
      MutableLiveData(EngcarpmasecimModel())

  var navArguments: Bundle? = null

  val engcarpmasecimList: MutableLiveData<MutableList<EngcarpmasecimRowModel>> =
      MutableLiveData(mutableListOf())
}
