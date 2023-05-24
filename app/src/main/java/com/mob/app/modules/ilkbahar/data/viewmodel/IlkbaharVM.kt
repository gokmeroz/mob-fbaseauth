package com.mob.app.modules.ilkbahar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.ilkbahar.`data`.model.IlkbaharModel
import org.koin.core.KoinComponent

class IlkbaharVM : ViewModel(), KoinComponent {
  val ilkbaharModel: MutableLiveData<IlkbaharModel> = MutableLiveData(IlkbaharModel())

  var navArguments: Bundle? = null
}
