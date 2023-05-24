package com.mob.app.modules.engcarpmakonuanlatim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmakonuanlatim.`data`.model.EngcarpmakonuanlatimModel
import com.mob.app.modules.engcarpmakonuanlatim.`data`.model.ListapplethreeTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmakonuanlatimVM : ViewModel(), KoinComponent {
  val engcarpmakonuanlatimModel: MutableLiveData<EngcarpmakonuanlatimModel> =
      MutableLiveData(EngcarpmakonuanlatimModel())

  var navArguments: Bundle? = null

  val listapplethreeTwoList: MutableLiveData<MutableList<ListapplethreeTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
