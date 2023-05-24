package com.mob.app.modules.seasonsplayingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.seasonsplayingtwo.`data`.model.SeasonsplayingtwoModel
import org.koin.core.KoinComponent

class SeasonsplayingtwoVM : ViewModel(), KoinComponent {
  val seasonsplayingtwoModel: MutableLiveData<SeasonsplayingtwoModel> =
      MutableLiveData(SeasonsplayingtwoModel())

  var navArguments: Bundle? = null
}
