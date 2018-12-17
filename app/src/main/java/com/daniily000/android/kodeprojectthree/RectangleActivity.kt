package com.daniily000.android.kodeprojectthree

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.daniily000.android.kodeprojectthree.data.Rectangle
import com.daniily000.android.kodeprojectthree.data.d
import kotlinx.android.synthetic.main.activity_rectangle.*
import java.lang.NumberFormatException

class RectangleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        calculateCoordinatesButton.setOnClickListener {

            try {
                val rectangle = Rectangle(
                    coordinateX1.d(),
                    coordinateY1.d(),
                    coordinateX2.d(),
                    coordinateY2.d())

                perimeterText.text = rectangle.perimeter.toString()
                squareText.text = rectangle.square.toString()

            } catch (e: NumberFormatException) {
                Snackbar.make(it, getString(R.string.incorrect_input), Snackbar.LENGTH_LONG).show()
            }
        }

        calculateMeasurementsButton.setOnClickListener {

            try {
                val rectangle = Rectangle(
                    width.d(),
                    height.d())

                perimeterText.text = rectangle.perimeter.toString()
                squareText.text = rectangle.square.toString()

            } catch (e: NumberFormatException) {
                Snackbar.make(it, getString(R.string.incorrect_input), Snackbar.LENGTH_LONG).show()
            } catch (e: IllegalArgumentException) {
                Snackbar.make(it, getString(R.string.input_negative), Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
