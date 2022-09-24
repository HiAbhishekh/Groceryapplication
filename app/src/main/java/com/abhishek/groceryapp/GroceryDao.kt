package com.abhishek.groceryapp

import androidx.lifecycle.LiveData
import androidx.room.*

// Data access object
@Dao
interface GroceryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query( "SELECT * FROM grocerry_items")
    fun getAllGroceryItmes() : LiveData<List<GroceryItems>>


}