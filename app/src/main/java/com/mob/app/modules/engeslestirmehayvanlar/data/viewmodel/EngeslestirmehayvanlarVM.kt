package com.mob.app.modules.engeslestirmehayvanlar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.engeslestirmehayvanlar.`data`.model.EngeslestirmehayvanlarModel
import com.mob.app.modules.engeslestirmehayvanlar.`data`.model.GridlivestockoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EngeslestirmehayvanlarVM : ViewModel(), KoinComponent {
  val engeslestirmehayvanlarModel: MutableLiveData<EngeslestirmehayvanlarModel> =
      MutableLiveData(EngeslestirmehayvanlarModel())

  var navArguments: Bundle? = null

  val gridlivestockoneList: MutableLiveData<MutableList<GridlivestockoneRowModel>> =
      MutableLiveData(mutableListOf())
}
