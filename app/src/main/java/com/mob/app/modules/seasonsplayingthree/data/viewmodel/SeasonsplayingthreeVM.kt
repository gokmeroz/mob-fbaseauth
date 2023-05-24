package com.mob.app.modules.seasonsplayingthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.seasonsplayingthree.`data`.model.SeasonsplayingthreeModel
import org.koin.core.KoinComponent

class SeasonsplayingthreeVM : ViewModel(), KoinComponent {
  val seasonsplayingthreeModel: MutableLiveData<SeasonsplayingthreeModel> =
      MutableLiveData(SeasonsplayingthreeModel())

  var navArguments: Bundle? = null
}
