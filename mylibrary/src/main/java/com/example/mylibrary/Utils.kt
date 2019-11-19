package com.example.mylibrary

class Utils {
    fun toBoolean(string : String):Boolean{
        return string == "1"
    }
}
fun String.toBool():Boolean{
    return this == "1"
}
