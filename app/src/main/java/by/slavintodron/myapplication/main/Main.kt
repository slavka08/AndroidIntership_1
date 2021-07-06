package by.slavintodron.myapplication.main

import by.slavintodron.myapplication.main.classes.Cashier
import by.slavintodron.myapplication.main.classes.Order
import by.slavintodron.myapplication.main.classes.Printer
import by.slavintodron.myapplication.main.classes.Storage
import by.slavintodron.myapplication.main.enumClasses.Dishes
import by.slavintodron.myapplication.main.enumClasses.Gender

class Main {

}

fun main(args: Array<String>) {
    val storage = Storage()

    for (item in createOrderList()) {
        storage.executeOrder(item)
    }

    Printer.printCashiersWaitFor(Dishes.WATER, storage)
}

fun createOrderList(): List<Order> {
    return listOf(
        Order(
            Cashier(
                "Oleg",
                Gender.MALE
            ),
            listOf(Dishes.FISH, Dishes.POTATO, Dishes.WATER),
        ),
        Order(
            Cashier(
                "Dima",
                Gender.MALE
            ),
            listOf(Dishes.FISH, Dishes.POTATO, Dishes.WATER),
        ),
        Order(
            Cashier(
                "Vasil",
                Gender.ALIEN
            ),
            listOf(Dishes.FISH, Dishes.POTATO, Dishes.WATER),
        ),
        Order(
            Cashier(
                "Lena",
                Gender.FEMALE
            ),
            listOf(Dishes.MEAT, Dishes.POTATO, Dishes.WATER),
        )

    )
}