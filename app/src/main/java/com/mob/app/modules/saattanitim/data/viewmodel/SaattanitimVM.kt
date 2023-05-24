package com.mob.app.modules.saattanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.saattanitim.`data`.model.SaattanitimModel
import org.koin.core.KoinComponent

class SaattanitimVM : ViewModel(), KoinComponent {
  val saattanitimModel: MutableLiveData<SaattanitimModel> = MutableLiveData(SaattanitimModel())

  var navArguments: Bundle? = null
}
