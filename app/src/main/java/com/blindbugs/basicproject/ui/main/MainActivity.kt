package com.blindbugs.basicproject.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.blindbugs.basicproject.R
import com.blindbugs.basicproject.domain.model.Meal
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(), MainPresenter.View {
    private val mainPresenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(mainPresenter)
        mainPresenter.view = this
    }

    override fun showMeal(meal: Meal) {
        Toast.makeText(this, meal.name, Toast.LENGTH_LONG).show()
    }
}
