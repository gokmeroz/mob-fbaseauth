package com.mob.app.modules.eslestirmesayilartwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmesayilartwo.`data`.model.EslestirmesayilartwoModel
import org.koin.core.KoinComponent

class EslestirmesayilartwoVM : ViewModel(), KoinComponent {
  val eslestirmesayilartwoModel: MutableLiveData<EslestirmesayilartwoModel> =
      MutableLiveData(EslestirmesayilartwoModel())

  var navArguments: Bundle? = null
}
