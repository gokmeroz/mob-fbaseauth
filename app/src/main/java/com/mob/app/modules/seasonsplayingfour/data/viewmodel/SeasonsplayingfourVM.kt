package com.mob.app.modules.seasonsplayingfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.seasonsplayingfour.`data`.model.SeasonsplayingfourModel
import org.koin.core.KoinComponent

class SeasonsplayingfourVM : ViewModel(), KoinComponent {
  val seasonsplayingfourModel: MutableLiveData<SeasonsplayingfourModel> =
      MutableLiveData(SeasonsplayingfourModel())

  var navArguments: Bundle? = null
}
