package com.blindbugs.basicproject.domain.usecase

import com.blindbugs.basicproject.domain.model.MealCollection

class GetRandomMealUseCase(private val mealCollection: MealCollection) {
    suspend fun getRandomMeal() = mealCollection.getRandomMeal()
}