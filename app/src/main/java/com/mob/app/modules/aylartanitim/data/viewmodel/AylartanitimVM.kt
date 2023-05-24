package com.mob.app.modules.aylartanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.aylartanitim.`data`.model.AylartanitimModel
import org.koin.core.KoinComponent

class AylartanitimVM : ViewModel(), KoinComponent {
  val aylartanitimModel: MutableLiveData<AylartanitimModel> = MutableLiveData(AylartanitimModel())

  var navArguments: Bundle? = null
}
