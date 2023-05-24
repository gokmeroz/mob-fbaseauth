package com.mob.app.modules.learning.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.learning.`data`.model.LearningModel
import com.mob.app.modules.learning.`data`.model.LearningRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LearningVM : ViewModel(), KoinComponent {
  val learningModel: MutableLiveData<LearningModel> = MutableLiveData(LearningModel())

  var navArguments: Bundle? = null

  val learningList: MutableLiveData<MutableList<LearningRowModel>> =
      MutableLiveData(mutableListOf())
}
