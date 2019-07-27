package com.blindbugs.basicproject.ui.main

import android.util.Log
import com.blindbugs.basicproject.domain.model.Meal
import com.blindbugs.basicproject.domain.usecase.GetRandomMealUseCase
import com.blindbugs.basicproject.infrastructure.ui.BasePresenter
import kotlinx.coroutines.launch

class MainPresenter(private val getRandomMealUseCase: GetRandomMealUseCase) : BasePresenter() {

    var view: View? = null

    override fun onInit() {
        Log.d("potato", "init")
        launch {
            try {
                val meal = getRandomMealUseCase.getRandomMeal()
                view?.showMeal(meal)
            } catch (e: Exception) {
                Log.d("potato", "BAIA $e")
            }
        }
    }

    interface View {
        fun showMeal(meal: Meal)
    }

}