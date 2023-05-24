package com.mob.app.modules.engseasonsplayingthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engseasonsplayingthree.`data`.model.EngseasonsplayingthreeModel
import org.koin.core.KoinComponent

class EngseasonsplayingthreeVM : ViewModel(), KoinComponent {
  val engseasonsplayingthreeModel: MutableLiveData<EngseasonsplayingthreeModel> =
      MutableLiveData(EngseasonsplayingthreeModel())

  var navArguments: Bundle? = null
}
