package com.mob.app.modules.kis.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.kis.`data`.model.KisModel
import org.koin.core.KoinComponent

class KisVM : ViewModel(), KoinComponent {
  val kisModel: MutableLiveData<KisModel> = MutableLiveData(KisModel())

  var navArguments: Bundle? = null
}
