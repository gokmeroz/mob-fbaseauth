package com.mob.app.modules.saatvideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.saatvideo.`data`.model.SaatvideoModel
import org.koin.core.KoinComponent

class SaatvideoVM : ViewModel(), KoinComponent {
  val saatvideoModel: MutableLiveData<SaatvideoModel> = MutableLiveData(SaatvideoModel())

  var navArguments: Bundle? = null
}
