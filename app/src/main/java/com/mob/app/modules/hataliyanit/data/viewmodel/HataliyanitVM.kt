package com.mob.app.modules.hataliyanit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.hataliyanit.`data`.model.HataliyanitModel
import org.koin.core.KoinComponent

class HataliyanitVM : ViewModel(), KoinComponent {
  val hataliyanitModel: MutableLiveData<HataliyanitModel> = MutableLiveData(HataliyanitModel())

  var navArguments: Bundle? = null
}
