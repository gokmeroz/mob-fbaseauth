package com.mob.app.modules.engterssayitanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engterssayitanitim.`data`.model.EngterssayitanitimModel
import org.koin.core.KoinComponent

class EngterssayitanitimVM : ViewModel(), KoinComponent {
  val engterssayitanitimModel: MutableLiveData<EngterssayitanitimModel> =
      MutableLiveData(EngterssayitanitimModel())

  var navArguments: Bundle? = null
}
