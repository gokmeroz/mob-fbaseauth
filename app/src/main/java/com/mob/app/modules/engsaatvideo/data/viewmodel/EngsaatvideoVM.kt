package com.mob.app.modules.engsaatvideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engsaatvideo.`data`.model.EngsaatvideoModel
import org.koin.core.KoinComponent

class EngsaatvideoVM : ViewModel(), KoinComponent {
  val engsaatvideoModel: MutableLiveData<EngsaatvideoModel> = MutableLiveData(EngsaatvideoModel())

  var navArguments: Bundle? = null
}
