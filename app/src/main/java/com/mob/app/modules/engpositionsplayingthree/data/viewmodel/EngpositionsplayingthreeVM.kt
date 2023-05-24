package com.mob.app.modules.engpositionsplayingthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engpositionsplayingthree.`data`.model.EngpositionsplayingthreeModel
import org.koin.core.KoinComponent

class EngpositionsplayingthreeVM : ViewModel(), KoinComponent {
  val engpositionsplayingthreeModel: MutableLiveData<EngpositionsplayingthreeModel> =
      MutableLiveData(EngpositionsplayingthreeModel())

  var navArguments: Bundle? = null
}
