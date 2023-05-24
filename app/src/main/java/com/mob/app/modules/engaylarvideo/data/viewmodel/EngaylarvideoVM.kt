package com.mob.app.modules.engaylarvideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engaylarvideo.`data`.model.EngaylarvideoModel
import org.koin.core.KoinComponent

class EngaylarvideoVM : ViewModel(), KoinComponent {
  val engaylarvideoModel: MutableLiveData<EngaylarvideoModel> =
      MutableLiveData(EngaylarvideoModel())

  var navArguments: Bundle? = null
}
