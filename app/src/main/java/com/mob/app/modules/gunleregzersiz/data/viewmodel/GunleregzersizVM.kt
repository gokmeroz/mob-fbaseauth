package com.mob.app.modules.gunleregzersiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.gunleregzersiz.`data`.model.GunleregzersizModel
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2062RowModel
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2075RowModel
import com.mob.app.modules.gunleregzersiz.`data`.model.Listrectangle2080FiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GunleregzersizVM : ViewModel(), KoinComponent {
  val gunleregzersizModel: MutableLiveData<GunleregzersizModel> =
      MutableLiveData(GunleregzersizModel())

  var navArguments: Bundle? = null

  val listrectangle2062List: MutableLiveData<MutableList<Listrectangle2062RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2075List: MutableLiveData<MutableList<Listrectangle2075RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle2080FiveList: MutableLiveData<MutableList<Listrectangle2080FiveRowModel>> =
      MutableLiveData(mutableListOf())
}
