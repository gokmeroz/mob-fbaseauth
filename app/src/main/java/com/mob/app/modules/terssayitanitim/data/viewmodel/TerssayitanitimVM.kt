package com.mob.app.modules.terssayitanitim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mob.app.modules.terssayitanitim.`data`.model.TerssayitanitimModel
import org.koin.core.KoinComponent

class TerssayitanitimVM : ViewModel(), KoinComponent {
  val terssayitanitimModel: MutableLiveData<TerssayitanitimModel> =
      MutableLiveData(TerssayitanitimModel())

  var navArguments: Bundle? = null
}
