package com.mob.app.modules.engcarpmasix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmasix.`data`.model.EngcarpmasixModel
import com.mob.app.modules.engcarpmasix.`data`.model.Listrectangle2071RowModel
import com.mob.app.modules.engcarpmasix.`data`.model.Listrectangle2076RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmasixVM : ViewModel(), KoinComponent {
  val engcarpmasixModel: MutableLiveData<EngcarpmasixModel> = MutableLiveData(EngcarpmasixModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2076RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2071RowModel>> =
      MutableLiveData(mutableListOf())
}
