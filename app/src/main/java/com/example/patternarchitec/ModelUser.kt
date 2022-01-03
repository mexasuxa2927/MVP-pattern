package com.example.patternarchitec

 class ModelUser(){

     var Name :String = "null"
     var age :String =  "null"

     constructor(Name1 :String, age1:String) : this() {
         this.Name = Name1
         this.age =  age1
     }


     @JvmName("getName1")
     fun getName(): String {
         return Name
     }



}