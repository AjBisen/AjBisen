package com.example.task.classes

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.customnave.R


class NaveBack(val context: Context) {
    private lateinit var currentView: View
    private lateinit var currentBall: View
    private lateinit var currentNaveIcon: ViewGroup
    private val handler = Handler()

    private fun showMessage(message: Any, showToast: Boolean) {
        if (showToast) {
            Toast.makeText(context, "$message", Toast.LENGTH_LONG).show()
        } else {
            Log.e("Message", "$message")
        }
    }

    fun init(view: View, ball: View, naveIcon: ViewGroup) {
        currentView = view
        currentBall = ball
        currentNaveIcon = naveIcon
        showCoordinates(currentView, currentBall, currentNaveIcon)
        selected(view)
    }

    private fun showCoordinates(view: View, ball: View, naveIcon: ViewGroup) {
        val ballLocation = IntArray(2)
        val screenLocation = IntArray(2)
        view.getLocationOnScreen(screenLocation)
        val xOnScreen = screenLocation[0]
        val yOnScreen = screenLocation[1]
        ball.getLocationOnScreen(ballLocation)
        val ballX = ballLocation[0]
        val ballY = ballLocation[1]
        showMessage("Ball X=$ballX Y=$ballY, Screen X=$xOnScreen Y=$yOnScreen", false)

        animatePosition(ball, xOnScreen.toFloat(), yOnScreen.toFloat(), ballX.toFloat(), ballY.toFloat())
        adjustIconsLayout(naveIcon, view.id)
    }

    private fun adjustIconsLayout(parentView: ViewGroup, id: Int) {
        val childCount = parentView.childCount
        for (i in 0 until childCount) {
            val childView = parentView.getChildAt(i)
            val newSize = if (childView.id != id) 150 else 200
            val translationY = if (childView.id != id) 20f else -30f
            adjustViewSize(childView, newSize)
            childView.translationY = translationY
        }
    }

    private fun adjustViewSize(view: View, size: Int) {
        val params = view.layoutParams
        params.width = size
        params.height = size
        view.layoutParams = params
    }

    private fun animatePosition(view: View, viewX: Float, viewY: Float, ballX: Float, ballY: Float) {
        val animX = ObjectAnimator.ofFloat(view, "translationX", ballX, viewX - if (ballX > viewX) 25 else 25)
        animX.duration = 500
        animX.start()

        val animY = ObjectAnimator.ofFloat(view, "translationY", 0f, 0f)
        animY.duration = 1000
        animY.start()

        if (ballX != viewX) {
            handler.postDelayed({
                showCoordinates(currentView, currentBall, currentNaveIcon)
            }, 1000)
        }
    }
    private fun selected(view: View)
    {
       // Example color, you can use any color you want
val button =view


    }
}
