package com.mob.app.modules.oyun.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.oyun.`data`.model.OyunModel
import com.mob.app.modules.oyun.`data`.model.OyunRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OyunVM : ViewModel(), KoinComponent {
  val oyunModel: MutableLiveData<OyunModel> = MutableLiveData(OyunModel())

  var navArguments: Bundle? = null

  val oyunList: MutableLiveData<MutableList<OyunRowModel>> = MutableLiveData(mutableListOf())
}
