package com.mob.app.modules.engseasonstanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engseasonstanitim.`data`.model.EngseasonstanitimModel
import org.koin.core.KoinComponent

class EngseasonstanitimVM : ViewModel(), KoinComponent {
  val engseasonstanitimModel: MutableLiveData<EngseasonstanitimModel> =
      MutableLiveData(EngseasonstanitimModel())

  var navArguments: Bundle? = null
}
