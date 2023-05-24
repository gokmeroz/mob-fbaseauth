package com.mob.app.modules.carpmafour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmafour.`data`.model.CarpmafourModel
import com.mob.app.modules.carpmafour.`data`.model.Listrectangle2081RowModel
import com.mob.app.modules.carpmafour.`data`.model.Listrectangle2082RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmafourVM : ViewModel(), KoinComponent {
  val carpmafourModel: MutableLiveData<CarpmafourModel> = MutableLiveData(CarpmafourModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2081RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2082RowModel>> =
      MutableLiveData(mutableListOf())
}
