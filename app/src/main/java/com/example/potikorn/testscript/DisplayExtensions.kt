package com.example.potikorn.testscript

import android.app.Activity
import android.content.Intent
import java.util.*

fun setLocale(activity: Activity,lang: String) {
    val myLocale = Locale(lang)
    val res = activity.resources
    val dm = res.displayMetrics
    val conf = res.configuration
    conf.locale = myLocale
    res.updateConfiguration(conf, dm)
    val refresh = Intent(activity, activity::class.java)
    activity.startActivity(refresh)
    activity.finish()
}