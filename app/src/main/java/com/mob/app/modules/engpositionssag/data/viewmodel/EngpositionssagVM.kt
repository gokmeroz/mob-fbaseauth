package com.mob.app.modules.engpositionssag.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionssag.`data`.model.EngpositionssagModel
import org.koin.core.KoinComponent

class EngpositionssagVM : ViewModel(), KoinComponent {
  val engpositionssagModel: MutableLiveData<EngpositionssagModel> =
      MutableLiveData(EngpositionssagModel())

  var navArguments: Bundle? = null
}
