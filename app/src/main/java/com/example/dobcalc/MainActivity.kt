package com.example.dobcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDatePicker: Button = findViewById(R.id.buttonDatePicker)

        buttonDatePicker.setOnClickListener {
            Toast.makeText(this, "buttonDatePicker pressed", Toast.LENGTH_LONG).show()
        }
    }
}