package com.mob.app.modules.eslestirmetanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmetanitim.`data`.model.EslestirmetanitimModel
import org.koin.core.KoinComponent

class EslestirmetanitimVM : ViewModel(), KoinComponent {
  val eslestirmetanitimModel: MutableLiveData<EslestirmetanitimModel> =
      MutableLiveData(EslestirmetanitimModel())

  var navArguments: Bundle? = null
}
