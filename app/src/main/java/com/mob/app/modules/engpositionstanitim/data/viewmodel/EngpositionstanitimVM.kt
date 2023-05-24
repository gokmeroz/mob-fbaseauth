package com.mob.app.modules.engpositionstanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionstanitim.`data`.model.EngpositionstanitimModel
import org.koin.core.KoinComponent

class EngpositionstanitimVM : ViewModel(), KoinComponent {
  val engpositionstanitimModel: MutableLiveData<EngpositionstanitimModel> =
      MutableLiveData(EngpositionstanitimModel())

  var navArguments: Bundle? = null
}
