package com.krillinator.lektion_7_part_two

import com.krillinator.lektion_7_part_two.models.StudentState
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test() {

        val benny = StudentState("Benny", 15)
        val myCopy = benny.copy(name = "")    // Best Practice


        println(benny)
        println(myCopy)

        // [...user]
        // Takes in all variables - and changes only the stated variables

    }

    @Test
    fun lambdaTest() {

        val nameList = listOf(
            "Benny",
            "Frida",
            "Anton",
            "Linda"
        )

        // With Lambda expression
        nameList.forEach {
            name -> println(name)
        }

        // With shorthand 'IT' Lambda expression
        nameList.forEach { println(it) }

        // Without Lambda
        for (name in nameList) {
            println(name)
        }

    }


}