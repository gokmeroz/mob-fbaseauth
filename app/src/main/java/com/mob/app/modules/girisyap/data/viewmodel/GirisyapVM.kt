package com.mob.app.modules.girisyap.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.girisyap.`data`.model.GirisyapModel
import org.koin.core.KoinComponent

class GirisyapVM : ViewModel(), KoinComponent {
  val girisyapModel: MutableLiveData<GirisyapModel> = MutableLiveData(GirisyapModel())

  var navArguments: Bundle? = null
}
