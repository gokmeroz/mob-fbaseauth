package com.mob.app.modules.engpositionsplayintwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionsplayintwo.`data`.model.EngpositionsplayintwoModel
import com.mob.app.modules.engpositionsplayintwo.`data`.model.Listbasketballone1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngpositionsplayintwoVM : ViewModel(), KoinComponent {
  val engpositionsplayintwoModel: MutableLiveData<EngpositionsplayintwoModel> =
      MutableLiveData(EngpositionsplayintwoModel())

  var navArguments: Bundle? = null

  val listbasketballoneList: MutableLiveData<MutableList<Listbasketballone1RowModel>> =
      MutableLiveData(mutableListOf())
}
