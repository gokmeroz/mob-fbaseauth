package com.mob.app.modules.eslestirmesayilar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmesayilar.`data`.model.EslestirmesayilarModel
import com.mob.app.modules.eslestirmesayilar.`data`.model.Gridnumberblocksone3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EslestirmesayilarVM : ViewModel(), KoinComponent {
  val eslestirmesayilarModel: MutableLiveData<EslestirmesayilarModel> =
      MutableLiveData(EslestirmesayilarModel())

  var navArguments: Bundle? = null

  val gridnumberblocksoneList: MutableLiveData<MutableList<Gridnumberblocksone3RowModel>> =
      MutableLiveData(mutableListOf())
}
