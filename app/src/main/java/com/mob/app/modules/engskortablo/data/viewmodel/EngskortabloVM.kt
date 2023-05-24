package com.mob.app.modules.engskortablo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engskortablo.`data`.model.EngskortabloModel
import com.mob.app.modules.engskortablo.`data`.model.EngskortabloRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngskortabloVM : ViewModel(), KoinComponent {
  val engskortabloModel: MutableLiveData<EngskortabloModel> = MutableLiveData(EngskortabloModel())

  var navArguments: Bundle? = null

  val engskortabloList: MutableLiveData<MutableList<EngskortabloRowModel>> =
      MutableLiveData(mutableListOf())
}
