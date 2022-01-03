package com.example.patternarchitec.UI

import com.example.patternarchitec.ModelUser

class AppPrezenter {

        var appView :AppView

        constructor(appView: AppView){
            this.appView = appView
        }


        fun getAppFromModel ():ModelUser{
            val modelUser=ModelUser("Mexa","15")
            return modelUser

        }


        fun getAppDetaile(){
            appView.ongetAppName(getAppFromModel().getName())
        }


}