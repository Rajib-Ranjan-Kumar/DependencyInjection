package com.example.dependencyinjection.classes

import android.content.ContentValues.TAG
import android.util.Log

class EmailService {
fun send(to:String,from:String,body:String?){
    Log.d(TAG,"Email sent")
}
}