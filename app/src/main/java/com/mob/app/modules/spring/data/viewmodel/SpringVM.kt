package com.mob.app.modules.spring.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.spring.`data`.model.SpringModel
import org.koin.core.KoinComponent

class SpringVM : ViewModel(), KoinComponent {
  val springModel: MutableLiveData<SpringModel> = MutableLiveData(SpringModel())

  var navArguments: Bundle? = null
}
