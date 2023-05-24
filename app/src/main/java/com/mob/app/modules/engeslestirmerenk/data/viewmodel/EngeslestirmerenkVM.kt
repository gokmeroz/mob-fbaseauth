package com.mob.app.modules.engeslestirmerenk.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmerenk.`data`.model.EngeslestirmerenkModel
import com.mob.app.modules.engeslestirmerenk.`data`.model.GridcolorpaletteoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngeslestirmerenkVM : ViewModel(), KoinComponent {
  val engeslestirmerenkModel: MutableLiveData<EngeslestirmerenkModel> =
      MutableLiveData(EngeslestirmerenkModel())

  var navArguments: Bundle? = null

  val gridcolorpaletteoneList: MutableLiveData<MutableList<GridcolorpaletteoneRowModel>> =
      MutableLiveData(mutableListOf())
}
