package com.mob.app.modules.positionssag.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionssag.`data`.model.PositionssagModel
import org.koin.core.KoinComponent

class PositionssagVM : ViewModel(), KoinComponent {
  val positionssagModel: MutableLiveData<PositionssagModel> = MutableLiveData(PositionssagModel())

  var navArguments: Bundle? = null
}
