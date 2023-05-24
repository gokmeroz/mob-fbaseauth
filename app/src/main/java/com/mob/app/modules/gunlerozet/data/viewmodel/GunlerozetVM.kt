package com.mob.app.modules.gunlerozet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.gunlerozet.`data`.model.GunlerozetModel
import com.mob.app.modules.gunlerozet.`data`.model.Listrectangle2080RowModel
import com.mob.app.modules.gunlerozet.`data`.model.Listrectangle2080TwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GunlerozetVM : ViewModel(), KoinComponent {
  val gunlerozetModel: MutableLiveData<GunlerozetModel> = MutableLiveData(GunlerozetModel())

  var navArguments: Bundle? = null

  val listrectangle2080List: MutableLiveData<MutableList<Listrectangle2080RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2080TwoList: MutableLiveData<MutableList<Listrectangle2080TwoRowModel>> =
      MutableLiveData(mutableListOf())
}
