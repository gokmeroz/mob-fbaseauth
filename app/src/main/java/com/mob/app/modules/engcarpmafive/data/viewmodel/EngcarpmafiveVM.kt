package com.mob.app.modules.engcarpmafive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmafive.`data`.model.EngcarpmafiveModel
import com.mob.app.modules.engcarpmafive.`data`.model.EngcarpmafiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmafiveVM : ViewModel(), KoinComponent {
  val engcarpmafiveModel: MutableLiveData<EngcarpmafiveModel> =
      MutableLiveData(EngcarpmafiveModel())

  var navArguments: Bundle? = null

  val engcarpmafiveList: MutableLiveData<MutableList<EngcarpmafiveRowModel>> =
      MutableLiveData(mutableListOf())
}
