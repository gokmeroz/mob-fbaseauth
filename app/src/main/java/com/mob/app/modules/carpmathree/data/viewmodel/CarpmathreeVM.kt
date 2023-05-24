package com.mob.app.modules.carpmathree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmathree.`data`.model.CarpmathreeModel
import com.mob.app.modules.carpmathree.`data`.model.CarpmathreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmathreeVM : ViewModel(), KoinComponent {
  val carpmathreeModel: MutableLiveData<CarpmathreeModel> = MutableLiveData(CarpmathreeModel())

  var navArguments: Bundle? = null

  val carpmathreeList: MutableLiveData<MutableList<CarpmathreeRowModel>> =
      MutableLiveData(mutableListOf())
}
