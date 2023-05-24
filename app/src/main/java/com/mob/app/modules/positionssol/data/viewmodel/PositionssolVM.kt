package com.mob.app.modules.positionssol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionssol.`data`.model.PositionssolModel
import org.koin.core.KoinComponent

class PositionssolVM : ViewModel(), KoinComponent {
  val positionssolModel: MutableLiveData<PositionssolModel> = MutableLiveData(PositionssolModel())

  var navArguments: Bundle? = null
}
