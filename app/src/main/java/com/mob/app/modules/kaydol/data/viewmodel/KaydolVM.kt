package com.mob.app.modules.kaydol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.kaydol.`data`.model.KaydolModel
import org.koin.core.KoinComponent

class KaydolVM : ViewModel(), KoinComponent {
  val kaydolModel: MutableLiveData<KaydolModel> = MutableLiveData(KaydolModel())

  var navArguments: Bundle? = null
}
