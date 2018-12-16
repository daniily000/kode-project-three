package com.daniily000.android.kodeprojectthree.data

import java.util.*

class Rectangle private constructor(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    val height: Double,
    val width: Double
) : Figure {

    init {
        if (height <= 0 || width <= 0) throw IllegalArgumentException("Inappropriate height or width")
    }

    constructor(height: Double, width: Double)
            : this(0.0, 0.0, width, height, width, height)

    constructor(x1: Double, y1: Double, x2: Double, y2: Double)
            : this(x1, y1, x2, y2, Math.abs(y1 - y2), Math.abs(x1 - x2))

    override val perimeter = 2 * height + 2 * width
    override val square = height * width
    override val coordinates: Set<Pair<Double, Double>> =
        Collections.unmodifiableSet(HashSet<Pair<Double, Double>>().also {
            it.add(Pair(x1, y1))
            it.add(Pair(x2, y2))
        })

}