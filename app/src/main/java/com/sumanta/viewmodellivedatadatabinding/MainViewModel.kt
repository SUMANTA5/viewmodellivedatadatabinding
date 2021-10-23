package com.sumanta.viewmodellivedatadatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val quoteLiveData = MutableLiveData("Do, ro do not. There in no try.")

    fun updateQuote(){
        quoteLiveData.value = "You'll see it when you believe it."
    }
}