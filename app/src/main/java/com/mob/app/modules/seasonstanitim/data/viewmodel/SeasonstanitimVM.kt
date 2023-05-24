package com.mob.app.modules.seasonstanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.seasonstanitim.`data`.model.SeasonstanitimModel
import org.koin.core.KoinComponent

class SeasonstanitimVM : ViewModel(), KoinComponent {
  val seasonstanitimModel: MutableLiveData<SeasonstanitimModel> =
      MutableLiveData(SeasonstanitimModel())

  var navArguments: Bundle? = null
}
