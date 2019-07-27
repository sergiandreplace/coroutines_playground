package com.blindbugs.basicproject.infrastructure.api

import com.blindbugs.basicproject.data.meal.network.MealListApiModel
import retrofit2.http.GET

interface TheMealDbApi {

    @GET("random.php")
    suspend fun getRandomMeal(): MealListApiModel
}