package com.mob.app.modules.carpmanine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmanine.`data`.model.CarpmanineModel
import com.mob.app.modules.carpmanine.`data`.model.CarpmanineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmanineVM : ViewModel(), KoinComponent {
  val carpmanineModel: MutableLiveData<CarpmanineModel> = MutableLiveData(CarpmanineModel())

  var navArguments: Bundle? = null

  val carpmanineList: MutableLiveData<MutableList<CarpmanineRowModel>> =
      MutableLiveData(mutableListOf())
}
