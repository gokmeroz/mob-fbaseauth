package com.mob.app.modules.carpmaeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmaeight.`data`.model.CarpmaeightModel
import com.mob.app.modules.carpmaeight.`data`.model.Listrectangle2085RowModel
import com.mob.app.modules.carpmaeight.`data`.model.Listrectangle2086RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmaeightVM : ViewModel(), KoinComponent {
  val carpmaeightModel: MutableLiveData<CarpmaeightModel> = MutableLiveData(CarpmaeightModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2085RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2086RowModel>> =
      MutableLiveData(mutableListOf())
}
