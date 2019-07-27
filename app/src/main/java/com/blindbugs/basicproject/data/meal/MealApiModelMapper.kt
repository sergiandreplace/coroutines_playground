package com.blindbugs.basicproject.data.meal

import com.blindbugs.basicproject.data.meal.network.MealApiModel
import com.blindbugs.basicproject.domain.model.Meal

class MealApiModelMapper {

    fun toModel(mealApiModel: MealApiModel): Meal = with(mealApiModel) {
        Meal(
            id = idMeal,
            name = strMeal.orEmpty(),
            tags = strTags?.split(",") ?: emptyList(),
            youtube = strYoutube,
            thumbnail = strMealThumb,
            source = strSource,
            instructions = strInstructions.orEmpty(),
            category = strCategory,
            area = strArea.orEmpty()
        )
    }

    fun String?.orEmpty() = this ?: EMPTY

    companion object {
        const val EMPTY: String = ""
    }
}