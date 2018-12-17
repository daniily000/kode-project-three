package com.daniily000.android.kodeprojectthree

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import com.daniily000.android.kodeprojectthree.data.Circle
import kotlinx.android.synthetic.main.activity_circle.*

class CircleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        calculateButton.setOnClickListener {

            try {
                val circle = Circle(radiusInput.d())
                perimeterText.text = circle.perimeter.toString()
                squareText.text = circle.square.toString()
            } catch (e: NumberFormatException) {
                Snackbar.make(it, "Unable to read double value from input!", Snackbar.LENGTH_LONG).show()
            }

        }
    }

    private fun EditText.d() : Double = this.text.toString().toDouble()
}