package com.example.mylibrary

class Utils {
    fun String.toBool():Boolean{
        return this == "1"
    }

    fun toBoolean(string : String):Boolean{
        return string == "1"
    }
}