package com.mob.app.modules.engwritetanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engwritetanitim.`data`.model.EngwritetanitimModel
import org.koin.core.KoinComponent

class EngwritetanitimVM : ViewModel(), KoinComponent {
  val engwritetanitimModel: MutableLiveData<EngwritetanitimModel> =
      MutableLiveData(EngwritetanitimModel())

  var navArguments: Bundle? = null
}
