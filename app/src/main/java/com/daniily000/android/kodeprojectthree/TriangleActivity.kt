package com.daniily000.android.kodeprojectthree

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.daniily000.android.kodeprojectthree.data.Triangle
import com.daniily000.android.kodeprojectthree.data.d
import kotlinx.android.synthetic.main.activity_triangle.*

class TriangleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        calculateButton.setOnClickListener {

            try {
                val triangle = Triangle(
                    sideA.d(),
                    sideB.d(),
                    sideC.d())

                perimeterText.text = triangle.perimeter.toString()
                squareText.text = triangle.square.toString()

            } catch (e: NumberFormatException) {
                Snackbar.make(it, getString(R.string.incorrect_input), Snackbar.LENGTH_LONG).show()
            } catch (e: IllegalArgumentException) {
                Snackbar.make(it, getString(R.string.input_negative), Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
