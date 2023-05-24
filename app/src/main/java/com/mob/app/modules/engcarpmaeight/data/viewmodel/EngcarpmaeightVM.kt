package com.mob.app.modules.engcarpmaeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmaeight.`data`.model.EngcarpmaeightModel
import com.mob.app.modules.engcarpmaeight.`data`.model.Listrectangle2072RowModel
import com.mob.app.modules.engcarpmaeight.`data`.model.Listrectangle2077RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmaeightVM : ViewModel(), KoinComponent {
  val engcarpmaeightModel: MutableLiveData<EngcarpmaeightModel> =
      MutableLiveData(EngcarpmaeightModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2077RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2072RowModel>> =
      MutableLiveData(mutableListOf())
}
