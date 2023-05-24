package com.mob.app.modules.dilsecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.dilsecim.`data`.model.DilsecimModel
import org.koin.core.KoinComponent

class DilsecimVM : ViewModel(), KoinComponent {
  val dilsecimModel: MutableLiveData<DilsecimModel> = MutableLiveData(DilsecimModel())

  var navArguments: Bundle? = null
}
