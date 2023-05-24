package com.mob.app.modules.engaylartanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engaylartanitim.`data`.model.EngaylartanitimModel
import org.koin.core.KoinComponent

class EngaylartanitimVM : ViewModel(), KoinComponent {
  val engaylartanitimModel: MutableLiveData<EngaylartanitimModel> =
      MutableLiveData(EngaylartanitimModel())

  var navArguments: Bundle? = null
}
