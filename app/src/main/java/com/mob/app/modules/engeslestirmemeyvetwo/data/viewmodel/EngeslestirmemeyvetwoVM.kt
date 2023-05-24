package com.mob.app.modules.engeslestirmemeyvetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmemeyvetwo.`data`.model.EngeslestirmemeyvetwoModel
import org.koin.core.KoinComponent

class EngeslestirmemeyvetwoVM : ViewModel(), KoinComponent {
  val engeslestirmemeyvetwoModel: MutableLiveData<EngeslestirmemeyvetwoModel> =
      MutableLiveData(EngeslestirmemeyvetwoModel())

  var navArguments: Bundle? = null
}
