package com.mob.app.modules.engeslestirmesayilar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmesayilar.`data`.model.EngeslestirmesayilarModel
import com.mob.app.modules.engeslestirmesayilar.`data`.model.Gridnumberblocksone1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngeslestirmesayilarVM : ViewModel(), KoinComponent {
  val engeslestirmesayilarModel: MutableLiveData<EngeslestirmesayilarModel> =
      MutableLiveData(EngeslestirmesayilarModel())

  var navArguments: Bundle? = null

  val gridnumberblocksoneList: MutableLiveData<MutableList<Gridnumberblocksone1RowModel>> =
      MutableLiveData(mutableListOf())
}
