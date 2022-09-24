package com.abhishek.groceryapp

class GroceryRepository (private val db: Grocerydatabase) {

    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun  getAllItems() = db.getGroceryDao().getAllGroceryItmes()
}