package com.mob.app.modules.carpmasix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmasix.`data`.model.CarpmasixModel
import com.mob.app.modules.carpmasix.`data`.model.Listrectangle2083RowModel
import com.mob.app.modules.carpmasix.`data`.model.Listrectangle2084RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmasixVM : ViewModel(), KoinComponent {
  val carpmasixModel: MutableLiveData<CarpmasixModel> = MutableLiveData(CarpmasixModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2083RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2084RowModel>> =
      MutableLiveData(mutableListOf())
}
