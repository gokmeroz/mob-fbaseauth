package com.mob.app.modules.engeslestirmetanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmetanitim.`data`.model.EngeslestirmetanitimModel
import org.koin.core.KoinComponent

class EngeslestirmetanitimVM : ViewModel(), KoinComponent {
  val engeslestirmetanitimModel: MutableLiveData<EngeslestirmetanitimModel> =
      MutableLiveData(EngeslestirmetanitimModel())

  var navArguments: Bundle? = null
}
