package com.mob.app.modules.engterssayi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engterssayi.`data`.model.EngterssayiModel
import org.koin.core.KoinComponent

class EngterssayiVM : ViewModel(), KoinComponent {
  val engterssayiModel: MutableLiveData<EngterssayiModel> = MutableLiveData(EngterssayiModel())

  var navArguments: Bundle? = null
}
