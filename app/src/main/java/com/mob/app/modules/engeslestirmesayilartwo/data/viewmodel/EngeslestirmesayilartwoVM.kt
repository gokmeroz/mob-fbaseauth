package com.mob.app.modules.engeslestirmesayilartwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmesayilartwo.`data`.model.EngeslestirmesayilartwoModel
import org.koin.core.KoinComponent

class EngeslestirmesayilartwoVM : ViewModel(), KoinComponent {
  val engeslestirmesayilartwoModel: MutableLiveData<EngeslestirmesayilartwoModel> =
      MutableLiveData(EngeslestirmesayilartwoModel())

  var navArguments: Bundle? = null
}
