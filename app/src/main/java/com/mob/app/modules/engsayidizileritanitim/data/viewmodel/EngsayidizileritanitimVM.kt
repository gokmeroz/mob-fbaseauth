package com.mob.app.modules.engsayidizileritanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engsayidizileritanitim.`data`.model.EngsayidizileritanitimModel
import org.koin.core.KoinComponent

class EngsayidizileritanitimVM : ViewModel(), KoinComponent {
  val engsayidizileritanitimModel: MutableLiveData<EngsayidizileritanitimModel> =
      MutableLiveData(EngsayidizileritanitimModel())

  var navArguments: Bundle? = null
}
