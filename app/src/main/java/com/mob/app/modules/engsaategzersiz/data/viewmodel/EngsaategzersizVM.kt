package com.mob.app.modules.engsaategzersiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engsaategzersiz.`data`.model.EngsaategzersizModel
import com.mob.app.modules.engsaategzersiz.`data`.model.TypeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngsaategzersizVM : ViewModel(), KoinComponent {
  val engsaategzersizModel: MutableLiveData<EngsaategzersizModel> =
      MutableLiveData(EngsaategzersizModel())

  var navArguments: Bundle? = null

  val typeList: MutableLiveData<MutableList<TypeRowModel>> = MutableLiveData(mutableListOf())
}
