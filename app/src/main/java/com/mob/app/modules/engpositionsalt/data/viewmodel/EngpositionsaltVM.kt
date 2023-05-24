package com.mob.app.modules.engpositionsalt.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionsalt.`data`.model.EngpositionsaltModel
import org.koin.core.KoinComponent

class EngpositionsaltVM : ViewModel(), KoinComponent {
  val engpositionsaltModel: MutableLiveData<EngpositionsaltModel> =
      MutableLiveData(EngpositionsaltModel())

  var navArguments: Bundle? = null
}
