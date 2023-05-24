package com.mob.app.modules.engsayidizileri.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engsayidizileri.`data`.model.EngsayidizileriModel
import org.koin.core.KoinComponent

class EngsayidizileriVM : ViewModel(), KoinComponent {
  val engsayidizileriModel: MutableLiveData<EngsayidizileriModel> =
      MutableLiveData(EngsayidizileriModel())

  var navArguments: Bundle? = null
}
