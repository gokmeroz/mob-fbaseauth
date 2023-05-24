package com.mob.app.modules.skortablo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.skortablo.`data`.model.SkortabloModel
import com.mob.app.modules.skortablo.`data`.model.SkortabloRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SkortabloVM : ViewModel(), KoinComponent {
  val skortabloModel: MutableLiveData<SkortabloModel> = MutableLiveData(SkortabloModel())

  var navArguments: Bundle? = null

  val skortabloList: MutableLiveData<MutableList<SkortabloRowModel>> =
      MutableLiveData(mutableListOf())
}
