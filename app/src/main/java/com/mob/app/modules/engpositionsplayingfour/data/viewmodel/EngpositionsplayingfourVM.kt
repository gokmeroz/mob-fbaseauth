package com.mob.app.modules.engpositionsplayingfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionsplayingfour.`data`.model.EngpositionsplayingfourModel
import com.mob.app.modules.engpositionsplayingfour.`data`.model.Listbasketballone2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngpositionsplayingfourVM : ViewModel(), KoinComponent {
  val engpositionsplayingfourModel: MutableLiveData<EngpositionsplayingfourModel> =
      MutableLiveData(EngpositionsplayingfourModel())

  var navArguments: Bundle? = null

  val listbasketballoneList: MutableLiveData<MutableList<Listbasketballone2RowModel>> =
      MutableLiveData(mutableListOf())
}
