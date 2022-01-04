package com.example.patternarchitec

 class ModelUser(){

     var Name :String = ""
     var Age  :String = ""


     constructor(Name:String,Age :String) : this() {
         this.Name = Name
         this.Age  = Age
     }


     @JvmName("getName1")
     fun getName():String{
         return this.Name
     }

     @JvmName("getAge1")
     fun getAge():String{
         return this.Age
     }



}