package com.mob.app.modules.engseasonsecim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engseasonsecim.`data`.model.EngseasonsecimModel
import com.mob.app.modules.engseasonsecim.`data`.model.EngseasonsecimRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngseasonsecimVM : ViewModel(), KoinComponent {
  val engseasonsecimModel: MutableLiveData<EngseasonsecimModel> =
      MutableLiveData(EngseasonsecimModel())

  var navArguments: Bundle? = null

  val engseasonsecimList: MutableLiveData<MutableList<EngseasonsecimRowModel>> =
      MutableLiveData(mutableListOf())
}
