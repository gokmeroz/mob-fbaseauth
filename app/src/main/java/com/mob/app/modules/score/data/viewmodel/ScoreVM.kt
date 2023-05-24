package com.mob.app.modules.score.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.score.`data`.model.ScoreModel
import org.koin.core.KoinComponent

class ScoreVM : ViewModel(), KoinComponent {
  val scoreModel: MutableLiveData<ScoreModel> = MutableLiveData(ScoreModel())

  var navArguments: Bundle? = null
}
