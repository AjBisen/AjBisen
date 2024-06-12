package com.example.customnave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.task.classes.Cnave
import com.example.task.classes.Nave
import com.example.task.classes.naveobj
import com.example.task.classes.state

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Cnave(this)
        Nave.getInstance(this.applicationContext)
        val viewGroup:RelativeLayout=findViewById(R.id.abc)
        Nave.add(viewGroup)
        naveobj.naveobj.imageButton1.setImageResource(R.drawable.ic_launcher_foreground)
        naveobj.naveobj.imageButton2.setImageResource(R.drawable.ic_launcher_foreground)
        naveobj.naveobj.imageButton3.setImageResource(R.drawable.ic_launcher_foreground)
        naveobj.naveobj.imageButton4.setImageResource(R.drawable.ic_launcher_foreground)
        naveobj.naveobj.imageButton5.setImageResource(R.drawable.ic_launcher_foreground)


    }
}