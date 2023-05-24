package com.mob.app.modules.engeslestirmerenktwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmerenktwo.`data`.model.EngeslestirmerenktwoModel
import org.koin.core.KoinComponent

class EngeslestirmerenktwoVM : ViewModel(), KoinComponent {
  val engeslestirmerenktwoModel: MutableLiveData<EngeslestirmerenktwoModel> =
      MutableLiveData(EngeslestirmerenktwoModel())

  var navArguments: Bundle? = null
}
