package com.mob.app.modules.eslestirmehayvanlar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.eslestirmehayvanlar.`data`.model.EslestirmehayvanlarModel
import com.mob.app.modules.eslestirmehayvanlar.`data`.model.Gridlivestockone1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EslestirmehayvanlarVM : ViewModel(), KoinComponent {
  val eslestirmehayvanlarModel: MutableLiveData<EslestirmehayvanlarModel> =
      MutableLiveData(EslestirmehayvanlarModel())

  var navArguments: Bundle? = null

  val gridlivestockoneList: MutableLiveData<MutableList<Gridlivestockone1RowModel>> =
      MutableLiveData(mutableListOf())
}
