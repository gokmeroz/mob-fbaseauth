package com.mob.app.modules.engpositionson.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionson.`data`.model.EngpositionsonModel
import org.koin.core.KoinComponent

class EngpositionsonVM : ViewModel(), KoinComponent {
  val engpositionsonModel: MutableLiveData<EngpositionsonModel> =
      MutableLiveData(EngpositionsonModel())

  var navArguments: Bundle? = null
}
