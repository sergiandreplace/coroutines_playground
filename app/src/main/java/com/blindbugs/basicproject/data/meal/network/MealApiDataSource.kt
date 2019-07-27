package com.blindbugs.basicproject.data.meal.network

import com.blindbugs.basicproject.infrastructure.api.TheMealDbApi

class MealApiDataSource(val api: TheMealDbApi) {

    suspend fun getRandomMeal(): MealApiModel {
        val response = api.getRandomMeal()
        return response.meals.first()
    }
}