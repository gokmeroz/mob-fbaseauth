package com.mob.app.modules.carpmakonuanlatim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmakonuanlatim.`data`.model.CarpmakonuanlatimModel
import com.mob.app.modules.carpmakonuanlatim.`data`.model.ListapplethreeTwo1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmakonuanlatimVM : ViewModel(), KoinComponent {
  val carpmakonuanlatimModel: MutableLiveData<CarpmakonuanlatimModel> =
      MutableLiveData(CarpmakonuanlatimModel())

  var navArguments: Bundle? = null

  val listapplethreeTwoList: MutableLiveData<MutableList<ListapplethreeTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}
