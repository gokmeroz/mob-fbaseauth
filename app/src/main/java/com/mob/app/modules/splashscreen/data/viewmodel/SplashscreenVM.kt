package com.mob.app.modules.splashscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.splashscreen.`data`.model.SplashscreenModel
import org.koin.core.KoinComponent

class SplashscreenVM : ViewModel(), KoinComponent {
  val splashscreenModel: MutableLiveData<SplashscreenModel> = MutableLiveData(SplashscreenModel())

  var navArguments: Bundle? = null
}
