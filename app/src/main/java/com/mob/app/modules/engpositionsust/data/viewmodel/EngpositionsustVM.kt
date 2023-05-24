package com.mob.app.modules.engpositionsust.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionsust.`data`.model.EngpositionsustModel
import org.koin.core.KoinComponent

class EngpositionsustVM : ViewModel(), KoinComponent {
  val engpositionsustModel: MutableLiveData<EngpositionsustModel> =
      MutableLiveData(EngpositionsustModel())

  var navArguments: Bundle? = null
}
