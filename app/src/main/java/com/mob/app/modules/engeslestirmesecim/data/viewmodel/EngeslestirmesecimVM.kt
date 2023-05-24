package com.mob.app.modules.engeslestirmesecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmesecim.`data`.model.EngeslestirmesecimModel
import com.mob.app.modules.engeslestirmesecim.`data`.model.GridnumberblocksoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngeslestirmesecimVM : ViewModel(), KoinComponent {
  val engeslestirmesecimModel: MutableLiveData<EngeslestirmesecimModel> =
      MutableLiveData(EngeslestirmesecimModel())

  var navArguments: Bundle? = null

  val gridnumberblocksoneList: MutableLiveData<MutableList<GridnumberblocksoneRowModel>> =
      MutableLiveData(mutableListOf())
}
