package by.slavintodron.myapplication.main.classes

import by.slavintodron.myapplication.main.enumClasses.Dishes

class Printer {
    companion object {
        fun print(order: Order): String {
            var temResult = ""
            for (dish in order.dishes) {
                println(dish.dishName)
                temResult += (dish.dishName) +" "
            }
            return temResult
        }

        fun printCashiersWaitFor(dish: Dishes, storage: Storage) {
            for (waiter in storage.getCashierPurchaseList()) {
                for (i in waiter.value.toList()) {
                    if (i == dish) {
                        println((waiter.key as Cashier).name)
                        println(waiter.value.toList())
                    }
                }
            }
        }
    }
}