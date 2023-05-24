package com.mob.app.modules.enggunlervideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enggunlervideo.`data`.model.EnggunlervideoModel
import org.koin.core.KoinComponent

class EnggunlervideoVM : ViewModel(), KoinComponent {
  val enggunlervideoModel: MutableLiveData<EnggunlervideoModel> =
      MutableLiveData(EnggunlervideoModel())

  var navArguments: Bundle? = null
}
