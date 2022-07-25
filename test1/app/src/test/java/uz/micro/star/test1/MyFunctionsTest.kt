package uz.micro.star.test1

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MyFunctionsTest {
    lateinit var myFunctions: MyFunctions

    @Before
    fun init() {
        myFunctions = MyFunctions()
    }

    @Test
    fun max() {
        assertEquals(myFunctions.max(3,4), 4)
    }

    @Test
    fun min() {
        assertEquals(4, 2 + 2)
    }
}