package com.mob.app.modules.engcarpmanine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmanine.`data`.model.EngcarpmanineModel
import com.mob.app.modules.engcarpmanine.`data`.model.EngcarpmanineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmanineVM : ViewModel(), KoinComponent {
  val engcarpmanineModel: MutableLiveData<EngcarpmanineModel> =
      MutableLiveData(EngcarpmanineModel())

  var navArguments: Bundle? = null

  val engcarpmanineList: MutableLiveData<MutableList<EngcarpmanineRowModel>> =
      MutableLiveData(mutableListOf())
}
