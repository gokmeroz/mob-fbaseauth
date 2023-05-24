package com.mob.app.modules.aylarvideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.aylarvideo.`data`.model.AylarvideoModel
import org.koin.core.KoinComponent

class AylarvideoVM : ViewModel(), KoinComponent {
  val aylarvideoModel: MutableLiveData<AylarvideoModel> = MutableLiveData(AylarvideoModel())

  var navArguments: Bundle? = null
}
