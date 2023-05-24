package com.mob.app.modules.engcarpmatwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmatwo.`data`.model.EngcarpmatwoModel
import com.mob.app.modules.engcarpmatwo.`data`.model.EngcarpmatwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmatwoVM : ViewModel(), KoinComponent {
  val engcarpmatwoModel: MutableLiveData<EngcarpmatwoModel> = MutableLiveData(EngcarpmatwoModel())

  var navArguments: Bundle? = null

  val engcarpmatwoList: MutableLiveData<MutableList<EngcarpmatwoRowModel>> =
      MutableLiveData(mutableListOf())
}
