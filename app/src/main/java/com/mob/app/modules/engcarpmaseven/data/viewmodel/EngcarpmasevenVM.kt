package com.mob.app.modules.engcarpmaseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmaseven.`data`.model.EngcarpmasevenModel
import com.mob.app.modules.engcarpmaseven.`data`.model.EngcarpmasevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmasevenVM : ViewModel(), KoinComponent {
  val engcarpmasevenModel: MutableLiveData<EngcarpmasevenModel> =
      MutableLiveData(EngcarpmasevenModel())

  var navArguments: Bundle? = null

  val engcarpmasevenList: MutableLiveData<MutableList<EngcarpmasevenRowModel>> =
      MutableLiveData(mutableListOf())
}
