package com.mob.app.modules.engeslestirmehayvanlartwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmehayvanlartwo.`data`.model.EngeslestirmehayvanlartwoModel
import org.koin.core.KoinComponent

class EngeslestirmehayvanlartwoVM : ViewModel(), KoinComponent {
  val engeslestirmehayvanlartwoModel: MutableLiveData<EngeslestirmehayvanlartwoModel> =
      MutableLiveData(EngeslestirmehayvanlartwoModel())

  var navArguments: Bundle? = null
}
