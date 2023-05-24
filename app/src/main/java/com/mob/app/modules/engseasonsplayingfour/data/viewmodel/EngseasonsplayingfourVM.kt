package com.mob.app.modules.engseasonsplayingfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engseasonsplayingfour.`data`.model.EngseasonsplayingfourModel
import org.koin.core.KoinComponent

class EngseasonsplayingfourVM : ViewModel(), KoinComponent {
  val engseasonsplayingfourModel: MutableLiveData<EngseasonsplayingfourModel> =
      MutableLiveData(EngseasonsplayingfourModel())

  var navArguments: Bundle? = null
}
