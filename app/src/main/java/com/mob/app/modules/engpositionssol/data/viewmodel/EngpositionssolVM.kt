package com.mob.app.modules.engpositionssol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionssol.`data`.model.EngpositionssolModel
import org.koin.core.KoinComponent

class EngpositionssolVM : ViewModel(), KoinComponent {
  val engpositionssolModel: MutableLiveData<EngpositionssolModel> =
      MutableLiveData(EngpositionssolModel())

  var navArguments: Bundle? = null
}
