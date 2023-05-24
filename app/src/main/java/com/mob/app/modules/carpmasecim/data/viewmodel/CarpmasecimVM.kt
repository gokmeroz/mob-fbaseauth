package com.mob.app.modules.carpmasecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmasecim.`data`.model.CarpmasecimModel
import com.mob.app.modules.carpmasecim.`data`.model.CarpmasecimRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmasecimVM : ViewModel(), KoinComponent {
  val carpmasecimModel: MutableLiveData<CarpmasecimModel> = MutableLiveData(CarpmasecimModel())

  var navArguments: Bundle? = null

  val carpmasecimList: MutableLiveData<MutableList<CarpmasecimRowModel>> =
      MutableLiveData(mutableListOf())
}
