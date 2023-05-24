package com.mob.app.modules.eslestirmerenk.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmerenk.`data`.model.EslestirmerenkModel
import com.mob.app.modules.eslestirmerenk.`data`.model.EslestirmerenkRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EslestirmerenkVM : ViewModel(), KoinComponent {
  val eslestirmerenkModel: MutableLiveData<EslestirmerenkModel> =
      MutableLiveData(EslestirmerenkModel())

  var navArguments: Bundle? = null

  val eslestirmerenkList: MutableLiveData<MutableList<EslestirmerenkRowModel>> =
      MutableLiveData(mutableListOf())
}
