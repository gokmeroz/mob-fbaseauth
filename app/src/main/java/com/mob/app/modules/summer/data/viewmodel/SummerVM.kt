package com.mob.app.modules.summer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.summer.`data`.model.SummerModel
import org.koin.core.KoinComponent

class SummerVM : ViewModel(), KoinComponent {
  val summerModel: MutableLiveData<SummerModel> = MutableLiveData(SummerModel())

  var navArguments: Bundle? = null
}
