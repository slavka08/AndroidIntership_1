package by.slavintodron.myapplication.main.classes

import by.slavintodron.myapplication.main.enumClasses.Dishes

class Order(
    val cashier: Cashier,
    val dishes: List<Dishes>,
) {
}