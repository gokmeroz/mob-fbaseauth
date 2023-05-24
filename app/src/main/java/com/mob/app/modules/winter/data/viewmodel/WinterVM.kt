package com.mob.app.modules.winter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.winter.`data`.model.WinterModel
import org.koin.core.KoinComponent

class WinterVM : ViewModel(), KoinComponent {
  val winterModel: MutableLiveData<WinterModel> = MutableLiveData(WinterModel())

  var navArguments: Bundle? = null
}
