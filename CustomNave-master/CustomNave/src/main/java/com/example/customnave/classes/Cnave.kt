package com.example.task.classes

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView
import com.example.customnave.R


interface OnBottomNavigationItemClickListener {
    fun onItemClicked(itemId: Int)
}

class Cnave @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {
    private var NaveBack: NaveBack
    private var listener: OnBottomNavigationItemClickListener? = null



    init {
        init(context)
        NaveBack = NaveBack(context)

    }

    fun setOnBottomNavigationItemClickListener(listener: OnBottomNavigationItemClickListener) {
        this.listener = listener
    }

    private fun init(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.custom_bottom_navigation, this, true)

        // Find and initialize your views here
        val img1: ImageButton = findViewById(R.id.img1)
        val img2: ImageButton = findViewById(R.id.img2)
        val img3: ImageButton = findViewById(R.id.img3)
        val img4: ImageButton = findViewById(R.id.img4)
        val img5: ImageButton = findViewById(R.id.img5)
        val ball: RelativeLayout = findViewById(R.id.floatingboll)
        val naveicon: RelativeLayout = findViewById(R.id.naveicon)
        val navecard: CardView =findViewById(R.id.navecard)

        img1.setOnClickListener {
            NaveBack.init(it, ball, naveicon)
            listener?.onItemClicked(R.id.img1)
state.state.value=1
        }
        img2.setOnClickListener {
            NaveBack.init(it, ball, naveicon)
            listener?.onItemClicked(R.id.img2)
            state.state.value=2

        }
        img3.setOnClickListener {
            NaveBack.init(it, ball, naveicon)
            listener?.onItemClicked(R.id.img3)
            state.state.value=3
        }
        img4.setOnClickListener {
            NaveBack.init(it, ball, naveicon)
            listener?.onItemClicked(R.id.img4)
            state.state.value=4
        }
        img5.setOnClickListener {
            NaveBack.init(it, ball, naveicon)
            listener?.onItemClicked(R.id.img5)
            state.state.value=5
        }
        naveobj.naveobj=navedata(img1,img2,img3,img4,img5,ball,navecard)

    }

    private fun l(msg: Any) {
        Log.e("cnave", "msg")
    }
}