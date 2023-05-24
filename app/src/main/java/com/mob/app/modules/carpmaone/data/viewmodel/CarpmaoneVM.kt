package com.mob.app.modules.carpmaone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.carpmaone.`data`.model.CarpmaoneModel
import com.mob.app.modules.carpmaone.`data`.model.Listrectangle2078RowModel
import com.mob.app.modules.carpmaone.`data`.model.Listrectangle2079RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarpmaoneVM : ViewModel(), KoinComponent {
  val carpmaoneModel: MutableLiveData<CarpmaoneModel> = MutableLiveData(CarpmaoneModel())

  var navArguments: Bundle? = null

  val listrectangle2073List: MutableLiveData<MutableList<Listrectangle2078RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2069List: MutableLiveData<MutableList<Listrectangle2079RowModel>> =
      MutableLiveData(mutableListOf())
}
