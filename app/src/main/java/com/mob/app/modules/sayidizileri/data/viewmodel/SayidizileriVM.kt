package com.mob.app.modules.sayidizileri.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.sayidizileri.`data`.model.SayidizileriModel
import org.koin.core.KoinComponent

class SayidizileriVM : ViewModel(), KoinComponent {
  val sayidizileriModel: MutableLiveData<SayidizileriModel> = MutableLiveData(SayidizileriModel())

  var navArguments: Bundle? = null
}
