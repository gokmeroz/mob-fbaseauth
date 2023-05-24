package com.mob.app.modules.enggunleregzersiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.enggunleregzersiz.`data`.model.EnggunleregzersizModel
import com.mob.app.modules.enggunleregzersiz.`data`.model.Listrec130RowModel
import com.mob.app.modules.enggunleregzersiz.`data`.model.Listrec136RowModel
import com.mob.app.modules.enggunleregzersiz.`data`.model.WeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EnggunleregzersizVM : ViewModel(), KoinComponent {
  val enggunleregzersizModel: MutableLiveData<EnggunleregzersizModel> =
      MutableLiveData(EnggunleregzersizModel())

  var navArguments: Bundle? = null

  val listrec136List: MutableLiveData<MutableList<Listrec136RowModel>> =
      MutableLiveData(mutableListOf())

  val listrec130List: MutableLiveData<MutableList<Listrec130RowModel>> =
      MutableLiveData(mutableListOf())

  val weList: MutableLiveData<MutableList<WeRowModel>> = MutableLiveData(mutableListOf())
}
