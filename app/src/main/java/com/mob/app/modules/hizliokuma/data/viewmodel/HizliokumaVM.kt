package com.mob.app.modules.hizliokuma.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.hizliokuma.`data`.model.HizliokumaModel
import org.koin.core.KoinComponent

class HizliokumaVM : ViewModel(), KoinComponent {
  val hizliokumaModel: MutableLiveData<HizliokumaModel> = MutableLiveData(HizliokumaModel())

  var navArguments: Bundle? = null
}
