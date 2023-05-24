package com.mob.app.modules.positionson.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionson.`data`.model.PositionsonModel
import org.koin.core.KoinComponent

class PositionsonVM : ViewModel(), KoinComponent {
  val positionsonModel: MutableLiveData<PositionsonModel> = MutableLiveData(PositionsonModel())

  var navArguments: Bundle? = null
}
