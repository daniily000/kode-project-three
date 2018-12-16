package com.daniily000.android.kodeprojectthree

import com.daniily000.android.kodeprojectthree.data.Circle
import com.daniily000.android.kodeprojectthree.data.Figure
import com.daniily000.android.kodeprojectthree.data.Rectangle
import com.daniily000.android.kodeprojectthree.data.Triangle
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testFigures() {

        HashSet<Figure>().also {
            it.add(Rectangle(1.0, 1.0, 5.0, 6.0))
            it.add(Rectangle(4.0, 5.0))
            it.add(Circle(1.0))
            it.add(Triangle(5.0, 6.0, 7.0))
        }.forEach {
            println("${it.javaClass.simpleName} perimeter=${it.perimeter}, square=${it.square}")
        }

    }
}
