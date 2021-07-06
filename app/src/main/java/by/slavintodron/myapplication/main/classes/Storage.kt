package by.slavintodron.myapplication.main.classes

import by.slavintodron.myapplication.main.enumClasses.Dishes

class Storage {
    private val store = mutableMapOf<Dishes, Int>()
    private val purchaseList = mutableMapOf<Cashier, MutableSet<Dishes>>()

    init {
        store[Dishes.FISH] = 2
        store[Dishes.MEAT] = 3
        store[Dishes.POTATO] = 999
        store[Dishes.WATER] = 2
    }

    fun getCashierPurchaseList(): Map<Cashier, Set<Dishes>> {
        return purchaseList
    }

    fun executeOrder(order: Order) {
        for (dish in order.dishes) {
            if (!getDish(dish)) {
                if (purchaseList[order.cashier] == null) {
                    purchaseList[order.cashier] = mutableSetOf()
                }
                purchaseList[order.cashier]?.add(dish)
            }
        }
    }

    private fun getDish(dish: Dishes): Boolean {
        var count = store.getOrDefault(dish, 0)
        var tmpResult = true
        if (count > 0) {
            store[dish] = --count
        } else {
            tmpResult = false
        }
        return tmpResult
    }
}