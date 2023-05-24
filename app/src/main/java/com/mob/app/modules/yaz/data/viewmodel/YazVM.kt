package com.mob.app.modules.yaz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.yaz.`data`.model.YazModel
import org.koin.core.KoinComponent

class YazVM : ViewModel(), KoinComponent {
  val yazModel: MutableLiveData<YazModel> = MutableLiveData(YazModel())

  var navArguments: Bundle? = null
}
