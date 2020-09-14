package com.fgonzalezh.ciclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var logView: TextView

    private fun addLog(message: String) {
        val text = logView.text

        logView.text = text.toString() + message + "\n"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logView = findViewById(R.id.logView)

        Log.d(TAG, "Se llamó a onCreate")

        addLog("Se llamó a onCreate")

    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "Se llamó a onStart")

        addLog("Se llamó a onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "Se llamó a onResume")

        addLog("Se llamó a onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "Se llamó a onPause")

        addLog("Se llamó a onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "Se llamó a onStop")

        addLog("Se llamó a onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "Se llamó a onDestroy")

        addLog("Se llamó a onDestroy")
    }
}