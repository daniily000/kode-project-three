package com.daniily000.android.kodeprojectthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.daniily000.android.kodeprojectthree.data.Figures
import com.daniily000.android.kodeprojectthree.data.Figures.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ArrayAdapter.createFromResource(
            this,
            R.array.figures,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
            figureSpinner.adapter = adapter
        }

        createButton.setOnClickListener {
            when (figureSpinner.selectedItemPosition) {

                CIRCLE.ordinal ->
                    Intent(this, CircleActivity::class.java).also { intent -> startActivity(intent)}


                RECTANGLE.ordinal ->
                    Intent(this, RectangleActivity::class.java).also { intent -> startActivity(intent)}

                TRIANGLE.ordinal ->
                    Intent(this, TriangleActivity::class.java).also { intent -> startActivity(intent)}
            }
        }
    }
}
