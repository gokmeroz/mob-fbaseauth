package com.mob.app.modules.engpositionsplaying.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionsplaying.`data`.model.EngpositionsplayingModel
import com.mob.app.modules.engpositionsplaying.`data`.model.ListbasketballoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngpositionsplayingVM : ViewModel(), KoinComponent {
  val engpositionsplayingModel: MutableLiveData<EngpositionsplayingModel> =
      MutableLiveData(EngpositionsplayingModel())

  var navArguments: Bundle? = null

  val listbasketballoneList: MutableLiveData<MutableList<ListbasketballoneRowModel>> =
      MutableLiveData(mutableListOf())
}
