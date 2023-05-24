package com.mob.app.modules.tanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.tanitim.`data`.model.TanitimModel
import org.koin.core.KoinComponent

class TanitimVM : ViewModel(), KoinComponent {
  val tanitimModel: MutableLiveData<TanitimModel> = MutableLiveData(TanitimModel())

  var navArguments: Bundle? = null
}
