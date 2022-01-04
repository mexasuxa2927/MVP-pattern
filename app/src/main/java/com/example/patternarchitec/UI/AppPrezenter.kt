package com.example.patternarchitec.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.patternarchitec.ModelUser

class AppPrezenter : ViewModel() {

    fun getAppName():ModelUser{

        return  ModelUser("Mexa","12")

    }
    var  multebledata:MutableLiveData<String> = MutableLiveData<String>()


    fun getAppNameData() {

        val string :String  = getAppName().getName()
        multebledata.value = string


    }



}