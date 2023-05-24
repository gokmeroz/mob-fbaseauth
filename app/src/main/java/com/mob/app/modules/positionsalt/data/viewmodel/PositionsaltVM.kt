package com.mob.app.modules.positionsalt.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionsalt.`data`.model.PositionsaltModel
import org.koin.core.KoinComponent

class PositionsaltVM : ViewModel(), KoinComponent {
  val positionsaltModel: MutableLiveData<PositionsaltModel> = MutableLiveData(PositionsaltModel())

  var navArguments: Bundle? = null
}
