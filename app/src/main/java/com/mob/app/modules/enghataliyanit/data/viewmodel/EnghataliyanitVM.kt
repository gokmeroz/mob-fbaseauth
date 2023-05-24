package com.mob.app.modules.enghataliyanit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enghataliyanit.`data`.model.EnghataliyanitModel
import org.koin.core.KoinComponent

class EnghataliyanitVM : ViewModel(), KoinComponent {
  val enghataliyanitModel: MutableLiveData<EnghataliyanitModel> =
      MutableLiveData(EnghataliyanitModel())

  var navArguments: Bundle? = null
}
