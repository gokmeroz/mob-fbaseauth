package com.mob.app.modules.enggunlertanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enggunlertanitim.`data`.model.EnggunlertanitimModel
import org.koin.core.KoinComponent

class EnggunlertanitimVM : ViewModel(), KoinComponent {
  val enggunlertanitimModel: MutableLiveData<EnggunlertanitimModel> =
      MutableLiveData(EnggunlertanitimModel())

  var navArguments: Bundle? = null
}
