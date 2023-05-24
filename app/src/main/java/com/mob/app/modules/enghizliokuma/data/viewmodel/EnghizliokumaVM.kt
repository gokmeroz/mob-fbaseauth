package com.mob.app.modules.enghizliokuma.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enghizliokuma.`data`.model.EnghizliokumaModel
import org.koin.core.KoinComponent

class EnghizliokumaVM : ViewModel(), KoinComponent {
  val enghizliokumaModel: MutableLiveData<EnghizliokumaModel> =
      MutableLiveData(EnghizliokumaModel())

  var navArguments: Bundle? = null
}
