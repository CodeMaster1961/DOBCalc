package com.example.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDatePicker: Button = findViewById(R.id.buttonDatePicker)

        buttonDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }

    fun clickDatePicker() {
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(
            this, { view, year, month, dayOfMonth ->
                Toast.makeText(
                    this,
                    "Year was $year, month was ${month + 1}, day of month was $dayOfMonth",
                    Toast.LENGTH_LONG
                ).show()
            }, year, month, day
        ).show()

    }
}