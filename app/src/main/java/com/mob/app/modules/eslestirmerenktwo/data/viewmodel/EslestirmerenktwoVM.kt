package com.mob.app.modules.eslestirmerenktwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmerenktwo.`data`.model.EslestirmerenktwoModel
import org.koin.core.KoinComponent

class EslestirmerenktwoVM : ViewModel(), KoinComponent {
  val eslestirmerenktwoModel: MutableLiveData<EslestirmerenktwoModel> =
      MutableLiveData(EslestirmerenktwoModel())

  var navArguments: Bundle? = null
}
