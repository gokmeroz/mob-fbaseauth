package com.mob.app.modules.engseasonsplayingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engseasonsplayingtwo.`data`.model.EngseasonsplayingtwoModel
import org.koin.core.KoinComponent

class EngseasonsplayingtwoVM : ViewModel(), KoinComponent {
  val engseasonsplayingtwoModel: MutableLiveData<EngseasonsplayingtwoModel> =
      MutableLiveData(EngseasonsplayingtwoModel())

  var navArguments: Bundle? = null
}
