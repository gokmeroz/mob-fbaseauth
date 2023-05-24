package com.mob.app.modules.introduction.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.introduction.`data`.model.IntroductionModel
import org.koin.core.KoinComponent

class IntroductionVM : ViewModel(), KoinComponent {
  val introductionModel: MutableLiveData<IntroductionModel> = MutableLiveData(IntroductionModel())

  var navArguments: Bundle? = null
}
