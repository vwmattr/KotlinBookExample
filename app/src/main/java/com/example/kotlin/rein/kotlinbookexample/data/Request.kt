package com.example.kotlin.rein.kotlinbookexample.data

import android.util.Log
import java.net.URL

/**
 * Created by rein on 9/11/15.
 */
public class Request(val url: String) {

    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.getSimpleName(), forecastJsonStr)
    }

}