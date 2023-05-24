package com.mob.app.modules.engcarpmafour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engcarpmafour.`data`.model.EngcarpmafourModel
import com.mob.app.modules.engcarpmafour.`data`.model.Listrectangle2070RowModel
import com.mob.app.modules.engcarpmafour.`data`.model.Listrectangle2074RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngcarpmafourVM : ViewModel(), KoinComponent {
  val engcarpmafourModel: MutableLiveData<EngcarpmafourModel> =
      MutableLiveData(EngcarpmafourModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2074RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2070RowModel>> =
      MutableLiveData(mutableListOf())
}
