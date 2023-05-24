package com.mob.app.modules.gunlertanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.gunlertanitim.`data`.model.GunlertanitimModel
import org.koin.core.KoinComponent

class GunlertanitimVM : ViewModel(), KoinComponent {
  val gunlertanitimModel: MutableLiveData<GunlertanitimModel> =
      MutableLiveData(GunlertanitimModel())

  var navArguments: Bundle? = null
}
