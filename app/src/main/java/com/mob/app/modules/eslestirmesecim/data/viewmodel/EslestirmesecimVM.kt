package com.mob.app.modules.eslestirmesecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmesecim.`data`.model.EslestirmesecimModel
import com.mob.app.modules.eslestirmesecim.`data`.model.Gridnumberblocksone2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EslestirmesecimVM : ViewModel(), KoinComponent {
  val eslestirmesecimModel: MutableLiveData<EslestirmesecimModel> =
      MutableLiveData(EslestirmesecimModel())

  var navArguments: Bundle? = null

  val gridnumberblocksoneList: MutableLiveData<MutableList<Gridnumberblocksone2RowModel>> =
      MutableLiveData(mutableListOf())
}
