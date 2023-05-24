package com.mob.app.modules.enggunlerozet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enggunlerozet.`data`.model.EnggunlerozetModel
import com.mob.app.modules.enggunlerozet.`data`.model.EnggunlerozetRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EnggunlerozetVM : ViewModel(), KoinComponent {
  val enggunlerozetModel: MutableLiveData<EnggunlerozetModel> =
      MutableLiveData(EnggunlerozetModel())

  var navArguments: Bundle? = null

  val enggunlerozetList: MutableLiveData<MutableList<EnggunlerozetRowModel>> =
      MutableLiveData(mutableListOf())
}
