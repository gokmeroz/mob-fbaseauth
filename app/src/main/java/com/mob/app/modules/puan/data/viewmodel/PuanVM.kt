package com.mob.app.modules.puan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.puan.`data`.model.PuanModel
import org.koin.core.KoinComponent

class PuanVM : ViewModel(), KoinComponent {
  val puanModel: MutableLiveData<PuanModel> = MutableLiveData(PuanModel())

  var navArguments: Bundle? = null
}
