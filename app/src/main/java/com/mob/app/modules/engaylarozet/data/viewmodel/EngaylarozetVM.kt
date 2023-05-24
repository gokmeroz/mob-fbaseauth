package com.mob.app.modules.engaylarozet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engaylarozet.`data`.model.EngaylarozetModel
import org.koin.core.KoinComponent

class EngaylarozetVM : ViewModel(), KoinComponent {
  val engaylarozetModel: MutableLiveData<EngaylarozetModel> = MutableLiveData(EngaylarozetModel())

  var navArguments: Bundle? = null
}
