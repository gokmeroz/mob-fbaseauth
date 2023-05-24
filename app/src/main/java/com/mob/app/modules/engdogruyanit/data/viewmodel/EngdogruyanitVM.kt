package com.mob.app.modules.engdogruyanit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engdogruyanit.`data`.model.EngdogruyanitModel
import org.koin.core.KoinComponent

class EngdogruyanitVM : ViewModel(), KoinComponent {
  val engdogruyanitModel: MutableLiveData<EngdogruyanitModel> =
      MutableLiveData(EngdogruyanitModel())

  var navArguments: Bundle? = null
}
