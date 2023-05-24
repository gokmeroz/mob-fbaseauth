package com.mob.app.modules.engseasonsplaying.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engseasonsplaying.`data`.model.EngseasonsplayingModel
import org.koin.core.KoinComponent

class EngseasonsplayingVM : ViewModel(), KoinComponent {
  val engseasonsplayingModel: MutableLiveData<EngseasonsplayingModel> =
      MutableLiveData(EngseasonsplayingModel())

  var navArguments: Bundle? = null
}
