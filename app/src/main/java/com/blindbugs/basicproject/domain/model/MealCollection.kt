package com.blindbugs.basicproject.domain.model

interface MealCollection {
    suspend fun getRandomMeal(): Meal
}