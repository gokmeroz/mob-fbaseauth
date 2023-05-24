package com.mob.app.modules.aylarozet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.aylarozet.`data`.model.AylarozetModel
import org.koin.core.KoinComponent

class AylarozetVM : ViewModel(), KoinComponent {
  val aylarozetModel: MutableLiveData<AylarozetModel> = MutableLiveData(AylarozetModel())

  var navArguments: Bundle? = null
}
