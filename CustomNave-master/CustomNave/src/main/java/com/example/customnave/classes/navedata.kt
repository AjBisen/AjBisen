package com.example.task.classes

import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

data class navedata(val imageButton1: ImageButton, val imageButton2: ImageButton, val imageButton3: ImageButton, val imageButton4: ImageButton, val imageButton5: ImageButton, val floatingball: RelativeLayout, val ineerfloatingball: CardView)
object naveobj{
    lateinit var naveobj:navedata
}