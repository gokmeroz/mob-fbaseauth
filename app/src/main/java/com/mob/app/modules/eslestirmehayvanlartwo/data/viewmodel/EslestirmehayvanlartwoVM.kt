package com.mob.app.modules.eslestirmehayvanlartwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmehayvanlartwo.`data`.model.EslestirmehayvanlartwoModel
import org.koin.core.KoinComponent

class EslestirmehayvanlartwoVM : ViewModel(), KoinComponent {
  val eslestirmehayvanlartwoModel: MutableLiveData<EslestirmehayvanlartwoModel> =
      MutableLiveData(EslestirmehayvanlartwoModel())

  var navArguments: Bundle? = null
}
