package com.mob.app.modules.seasonsecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.seasonsecim.`data`.model.SeasonsecimModel
import com.mob.app.modules.seasonsecim.`data`.model.SeasonsecimRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SeasonsecimVM : ViewModel(), KoinComponent {
  val seasonsecimModel: MutableLiveData<SeasonsecimModel> = MutableLiveData(SeasonsecimModel())

  var navArguments: Bundle? = null

  val seasonsecimList: MutableLiveData<MutableList<SeasonsecimRowModel>> =
      MutableLiveData(mutableListOf())
}
