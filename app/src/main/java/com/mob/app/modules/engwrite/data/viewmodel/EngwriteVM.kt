package com.mob.app.modules.engwrite.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engwrite.`data`.model.EngwriteModel
import org.koin.core.KoinComponent

class EngwriteVM : ViewModel(), KoinComponent {
  val engwriteModel: MutableLiveData<EngwriteModel> = MutableLiveData(EngwriteModel())

  var navArguments: Bundle? = null
}
