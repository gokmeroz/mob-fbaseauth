package com.mob.app.modules.engcarpmaone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmaone.`data`.model.EngcarpmaoneModel
import com.mob.app.modules.engcarpmaone.`data`.model.Listrectangle2069RowModel
import com.mob.app.modules.engcarpmaone.`data`.model.Listrectangle2073RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmaoneVM : ViewModel(), KoinComponent {
  val engcarpmaoneModel: MutableLiveData<EngcarpmaoneModel> = MutableLiveData(EngcarpmaoneModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2073RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2069RowModel>> =
      MutableLiveData(mutableListOf())
}
