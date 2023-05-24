package com.mob.app.modules.engeslestirmemeyve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmemeyve.`data`.model.EngeslestirmemeyveModel
import com.mob.app.modules.engeslestirmemeyve.`data`.model.GridhealthyfoodoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngeslestirmemeyveVM : ViewModel(), KoinComponent {
  val engeslestirmemeyveModel: MutableLiveData<EngeslestirmemeyveModel> =
      MutableLiveData(EngeslestirmemeyveModel())

  var navArguments: Bundle? = null

  val gridhealthyfoodoneList: MutableLiveData<MutableList<GridhealthyfoodoneRowModel>> =
      MutableLiveData(mutableListOf())
}
