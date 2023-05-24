package com.mob.app.modules.ogrenme.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.ogrenme.`data`.model.OgrenmeModel
import com.mob.app.modules.ogrenme.`data`.model.OgrenmeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OgrenmeVM : ViewModel(), KoinComponent {
  val ogrenmeModel: MutableLiveData<OgrenmeModel> = MutableLiveData(OgrenmeModel())

  var navArguments: Bundle? = null

  val ogrenmeList: MutableLiveData<MutableList<OgrenmeRowModel>> = MutableLiveData(mutableListOf())
}
