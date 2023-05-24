package com.mob.app.modules.fall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.fall.`data`.model.FallModel
import org.koin.core.KoinComponent

class FallVM : ViewModel(), KoinComponent {
  val fallModel: MutableLiveData<FallModel> = MutableLiveData(FallModel())

  var navArguments: Bundle? = null
}
