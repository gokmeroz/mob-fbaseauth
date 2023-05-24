package com.mob.app.modules.positionstanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionstanitim.`data`.model.PositionstanitimModel
import org.koin.core.KoinComponent

class PositionstanitimVM : ViewModel(), KoinComponent {
  val positionstanitimModel: MutableLiveData<PositionstanitimModel> =
      MutableLiveData(PositionstanitimModel())

  var navArguments: Bundle? = null
}
