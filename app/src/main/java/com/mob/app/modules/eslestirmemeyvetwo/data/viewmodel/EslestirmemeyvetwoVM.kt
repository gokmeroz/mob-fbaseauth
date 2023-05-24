package com.mob.app.modules.eslestirmemeyvetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmemeyvetwo.`data`.model.EslestirmemeyvetwoModel
import org.koin.core.KoinComponent

class EslestirmemeyvetwoVM : ViewModel(), KoinComponent {
  val eslestirmemeyvetwoModel: MutableLiveData<EslestirmemeyvetwoModel> =
      MutableLiveData(EslestirmemeyvetwoModel())

  var navArguments: Bundle? = null
}
