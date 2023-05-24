package com.mob.app.modules.saategzersiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.saategzersiz.`data`.model.SaategzersizModel
import com.mob.app.modules.saategzersiz.`data`.model.SaategzersizRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SaategzersizVM : ViewModel(), KoinComponent {
  val saategzersizModel: MutableLiveData<SaategzersizModel> = MutableLiveData(SaategzersizModel())

  var navArguments: Bundle? = null

  val saategzersizList: MutableLiveData<MutableList<SaategzersizRowModel>> =
      MutableLiveData(mutableListOf())
}
