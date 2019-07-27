package com.blindbugs.basicproject.data.meal

import com.blindbugs.basicproject.data.meal.network.MealApiDataSource
import com.blindbugs.basicproject.domain.model.MealCollection

class MealRepository(private val mealApiDataSource: MealApiDataSource, val mealApiModelMapper: MealApiModelMapper) :
    MealCollection {

    override suspend fun getRandomMeal() =
        mealApiModelMapper.toModel(mealApiDataSource.getRandomMeal())

}