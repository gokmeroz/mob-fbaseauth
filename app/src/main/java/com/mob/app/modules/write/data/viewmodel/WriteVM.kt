package com.mob.app.modules.write.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.write.`data`.model.WriteModel
import org.koin.core.KoinComponent

class WriteVM : ViewModel(), KoinComponent {
  val writeModel: MutableLiveData<WriteModel> = MutableLiveData(WriteModel())

  var navArguments: Bundle? = null
}
