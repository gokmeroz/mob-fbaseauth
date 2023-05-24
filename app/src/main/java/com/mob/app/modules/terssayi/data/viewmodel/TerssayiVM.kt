package com.mob.app.modules.terssayi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.terssayi.`data`.model.TerssayiModel
import org.koin.core.KoinComponent

class TerssayiVM : ViewModel(), KoinComponent {
  val terssayiModel: MutableLiveData<TerssayiModel> = MutableLiveData(TerssayiModel())

  var navArguments: Bundle? = null
}
