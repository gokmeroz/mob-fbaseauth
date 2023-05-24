package com.mob.app.modules.gunlervideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.gunlervideo.`data`.model.GunlervideoModel
import org.koin.core.KoinComponent

class GunlervideoVM : ViewModel(), KoinComponent {
  val gunlervideoModel: MutableLiveData<GunlervideoModel> = MutableLiveData(GunlervideoModel())

  var navArguments: Bundle? = null
}
