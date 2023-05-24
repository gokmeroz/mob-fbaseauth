package com.mob.app.modules.writetanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.writetanitim.`data`.model.WritetanitimModel
import org.koin.core.KoinComponent

class WritetanitimVM : ViewModel(), KoinComponent {
  val writetanitimModel: MutableLiveData<WritetanitimModel> = MutableLiveData(WritetanitimModel())

  var navArguments: Bundle? = null
}
