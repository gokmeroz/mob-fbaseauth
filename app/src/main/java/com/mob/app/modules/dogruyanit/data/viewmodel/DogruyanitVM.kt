package com.mob.app.modules.dogruyanit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.dogruyanit.`data`.model.DogruyanitModel
import org.koin.core.KoinComponent

class DogruyanitVM : ViewModel(), KoinComponent {
  val dogruyanitModel: MutableLiveData<DogruyanitModel> = MutableLiveData(DogruyanitModel())

  var navArguments: Bundle? = null
}
