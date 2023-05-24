package com.mob.app.modules.engaylaregzersiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engaylaregzersiz.`data`.model.EngaylaregzersizModel
import org.koin.core.KoinComponent

class EngaylaregzersizVM : ViewModel(), KoinComponent {
  val engaylaregzersizModel: MutableLiveData<EngaylaregzersizModel> =
      MutableLiveData(EngaylaregzersizModel())

  var navArguments: Bundle? = null
}
