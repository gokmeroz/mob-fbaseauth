package com.mob.app.modules.positionsplayingthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.positionsplayingthree.`data`.model.PositionsplayingthreeModel
import org.koin.core.KoinComponent

class PositionsplayingthreeVM : ViewModel(), KoinComponent {
  val positionsplayingthreeModel: MutableLiveData<PositionsplayingthreeModel> =
      MutableLiveData(PositionsplayingthreeModel())

  var navArguments: Bundle? = null
}
