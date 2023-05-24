package com.mob.app.modules.sonbahar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.sonbahar.`data`.model.SonbaharModel
import org.koin.core.KoinComponent

class SonbaharVM : ViewModel(), KoinComponent {
  val sonbaharModel: MutableLiveData<SonbaharModel> = MutableLiveData(SonbaharModel())

  var navArguments: Bundle? = null
}
