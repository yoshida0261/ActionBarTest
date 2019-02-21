package jp.co.stah.actionbartest

import io.mockk.every
import io.mockk.mockkObject
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    object MockObj {
        fun add(a: Int, b: Int) = a + b
    }

    // mockk
    @Test
    fun mockktest(){

        mockkObject(MockObj) // aplies mocking to an Object

        assertEquals(3, MockObj.add(1, 2))

        every { MockObj.add(1, 2) } returns 55

        assertEquals(55, MockObj.add(1, 2))
    }
}
