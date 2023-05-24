package com.mob.app.modules.carpmatwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmatwo.`data`.model.CarpmatwoModel
import com.mob.app.modules.carpmatwo.`data`.model.CarpmatwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmatwoVM : ViewModel(), KoinComponent {
  val carpmatwoModel: MutableLiveData<CarpmatwoModel> = MutableLiveData(CarpmatwoModel())

  var navArguments: Bundle? = null

  val carpmatwoList: MutableLiveData<MutableList<CarpmatwoRowModel>> =
      MutableLiveData(mutableListOf())
}
