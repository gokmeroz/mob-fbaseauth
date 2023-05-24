package com.mob.app.modules.engcarpmathree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmathree.`data`.model.EngcarpmathreeModel
import com.mob.app.modules.engcarpmathree.`data`.model.EngcarpmathreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmathreeVM : ViewModel(), KoinComponent {
  val engcarpmathreeModel: MutableLiveData<EngcarpmathreeModel> =
      MutableLiveData(EngcarpmathreeModel())

  var navArguments: Bundle? = null

  val engcarpmathreeList: MutableLiveData<MutableList<EngcarpmathreeRowModel>> =
      MutableLiveData(mutableListOf())
}
