package com.example.browsertopia

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(30, 50, 30, 30)

        val title = TextView(this)
        title.text = "BrowserTopia Mini Auto Tap"
        title.textSize = 22f

        val info = TextView(this)
        info.text = "Interval Auto Tap: 15 ms"

        val start = Button(this)
        start.text = "START AUTO TAP"

        val stop = Button(this)
        stop.text = "STOP ALL"

        layout.addView(title)
        layout.addView(info)
        layout.addView(start)
        layout.addView(stop)

        setContentView(layout)
    }
}
