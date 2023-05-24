package com.mob.app.modules.engsaattanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engsaattanitim.`data`.model.EngsaattanitimModel
import org.koin.core.KoinComponent

class EngsaattanitimVM : ViewModel(), KoinComponent {
  val engsaattanitimModel: MutableLiveData<EngsaattanitimModel> =
      MutableLiveData(EngsaattanitimModel())

  var navArguments: Bundle? = null
}
