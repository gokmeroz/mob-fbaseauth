package com.mob.app.modules.eslestirmemeyve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmemeyve.`data`.model.EslestirmemeyveModel
import com.mob.app.modules.eslestirmemeyve.`data`.model.Gridhealthyfoodone1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EslestirmemeyveVM : ViewModel(), KoinComponent {
  val eslestirmemeyveModel: MutableLiveData<EslestirmemeyveModel> =
      MutableLiveData(EslestirmemeyveModel())

  var navArguments: Bundle? = null

  val gridhealthyfoodoneList: MutableLiveData<MutableList<Gridhealthyfoodone1RowModel>> =
      MutableLiveData(mutableListOf())
}
