package com.example.task.classes

import android.content.Context
import android.view.ViewGroup

object Nave {
    private var cnaveInstance: Cnave? = null

    fun getInstance(context: Context): Cnave {
        if (cnaveInstance == null) {
            cnaveInstance = Cnave(context)
        }
        return cnaveInstance!!
    }

    fun add(viewGroup: ViewGroup) {
        if (cnaveInstance?.parent != null && cnaveInstance?.parent is ViewGroup) {
            (cnaveInstance?.parent as ViewGroup).removeView(cnaveInstance)
        }
        viewGroup.addView(cnaveInstance)
    }
}
