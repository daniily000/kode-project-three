package com.daniily000.android.kodeprojectthree.data

import java.util.*
import kotlin.math.PI

class Circle(val radius: Double) : Figure {

    override val perimeter = radius * 2 * PI
    override val square = radius * radius * PI
    override val coordinates: Set<Pair<Double, Double>> =
        Collections.unmodifiableSet(HashSet<Pair<Double, Double>>().also {
            it.add(Pair(0.0, 0.0))
        })

    init {
        if (radius <= 0) throw IllegalArgumentException("Inappropriate circle radius")
    }

}