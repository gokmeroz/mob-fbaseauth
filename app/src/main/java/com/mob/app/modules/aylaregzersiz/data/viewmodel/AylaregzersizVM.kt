package com.mob.app.modules.aylaregzersiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.aylaregzersiz.`data`.model.AylaregzersizModel
import org.koin.core.KoinComponent

class AylaregzersizVM : ViewModel(), KoinComponent {
  val aylaregzersizModel: MutableLiveData<AylaregzersizModel> =
      MutableLiveData(AylaregzersizModel())

  var navArguments: Bundle? = null
}
