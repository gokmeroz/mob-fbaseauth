package com.mob.app.modules.sayidizileritanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.sayidizileritanitim.`data`.model.SayidizileritanitimModel
import org.koin.core.KoinComponent

class SayidizileritanitimVM : ViewModel(), KoinComponent {
  val sayidizileritanitimModel: MutableLiveData<SayidizileritanitimModel> =
      MutableLiveData(SayidizileritanitimModel())

  var navArguments: Bundle? = null
}
