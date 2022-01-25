package edu.washington.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var bigButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        bigButton = findViewById<Button>(R.id.bigButton)
        bigButton.setOnClickListener {
            count += 1
            val presses = if (count === 1) "time" else "times"
            bigButton.setText(getString(R.string.buttonPress, count, presses))
        }
    }
}