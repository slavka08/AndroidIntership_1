package by.slavintodron.myapplication

import by.slavintodron.myapplication.main.classes.Cashier
import by.slavintodron.myapplication.main.classes.Order
import by.slavintodron.myapplication.main.classes.Printer
import by.slavintodron.myapplication.main.enumClasses.Dishes
import by.slavintodron.myapplication.main.enumClasses.Gender
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun printOrder() {
        val order = Order(
            Cashier("vv", Gender.MALE),
            listOf(Dishes.MEAT, Dishes.WATER)
        )

        Printer.print(order)
        assertEquals("meat water ", Printer.print(order))
    }
}