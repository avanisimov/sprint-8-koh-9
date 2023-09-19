package ru.practicum.sprint9koh9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    companion object {
        var currentTheme = R.style.Theme_Sprint9koh9
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(currentTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_1).setOnClickListener {
            currentTheme = R.style.Theme_Sprint9koh9
            recreate()
        }
        findViewById<Button>(R.id.btn_2).setOnClickListener {
            currentTheme = R.style.Theme_Sprint9koh9_2
            recreate()
        }
    }
}