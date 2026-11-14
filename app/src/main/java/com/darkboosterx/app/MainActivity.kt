package com.darkboosterx.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val screen = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(10, 10, 14))
        }

        val title = TextView(this).apply {
            text = "DARK BOOSTER X"
            textSize = 30f
            setTextColor(Color.RED)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "ULTIMATE GAMING CONTROL"
            textSize = 14f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        screen.addView(title)
        screen.addView(subtitle)

        setContentView(screen)
    }
}
