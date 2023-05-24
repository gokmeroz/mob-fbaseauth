package com.mob.app.modules.positionsust.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionsust.`data`.model.PositionsustModel
import org.koin.core.KoinComponent

class PositionsustVM : ViewModel(), KoinComponent {
  val positionsustModel: MutableLiveData<PositionsustModel> = MutableLiveData(PositionsustModel())

  var navArguments: Bundle? = null
}
