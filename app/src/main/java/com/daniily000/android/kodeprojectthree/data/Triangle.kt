package com.daniily000.android.kodeprojectthree.data

import java.lang.Math.sqrt
import java.util.*

class Triangle(val a: Double, val b: Double, val c: Double) : Figure {

    init {
        if (a <= 0 || b <= 0 || c <= 0
            || b + c <= a
            || a + c <= b
            || a + b <= c
        )
            throw IllegalArgumentException("Inappropriate side sizes")
    }

    override val perimeter = a + b + c
    override val square =
        Math.sqrt(perimeter / 2 * (perimeter / 2 - a) * (perimeter / 2 - b) * (perimeter / 2 - c))
    override val coordinates: Set<Pair<Double, Double>> =
        Collections.unmodifiableSet(HashSet<Pair<Double, Double>>().also {
            it.add(Pair(0.0, 0.0))
            it.add(Pair(a, 0.0))
            it.add(Pair((c*c - b*b - a*a) / (-2) / a, sqrt(b*b - (c*c - b*b - a*a) / (-2) / a)))
        })


}