package com.mob.app.modules.seasonsplaying.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.seasonsplaying.`data`.model.SeasonsplayingModel
import org.koin.core.KoinComponent

class SeasonsplayingVM : ViewModel(), KoinComponent {
  val seasonsplayingModel: MutableLiveData<SeasonsplayingModel> =
      MutableLiveData(SeasonsplayingModel())

  var navArguments: Bundle? = null
}
