package com.example.BudgetBuddyApp

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tracker.R

// DetailViewActivity.kt
class DetailViewActivity : AppCompatActivity() {

    private lateinit var textViewDate: TextView
    private lateinit var textViewMorningExpenses: TextView
    private lateinit var textViewAfternoonExpenses: TextView
    private lateinit var textViewExpenseNotes: TextView
    private lateinit var buttonCalculateHighest: Button
    private lateinit var buttonAverageSpending: Button
    private lateinit var buttonBackToMain: Button

    override fun onCreate(savedInstanceState : android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)

        textViewDate = findViewById(R.id.textViewDate)
        textViewMorningExpenses = findViewById(R.id.textViewMorningExpenses)
        textViewAfternoonExpenses = findViewById(R.id.textViewAfternoonExpenses)
        textViewExpenseNotes = findViewById(R.id.textViewExpenseNotes)
        buttonCalculateHighest = findViewById(R.id.buttonCalculateHighest)
        buttonAverageSpending = findViewById(R.id.buttonAverageSpending)
        buttonBackToMain = findViewById(R.id.buttonBackToMain)

        // Set up the UI with data
        setupUI()

        buttonCalculateHighest.setOnClickListener {
            calculateHighestExpenses()
        }

        buttonAverageSpending.setOnClickListener {
            showAverageSpending()
        }

        buttonBackToMain.setOnClickListener {
            finish() // Navigate back to the main screen
        }
    }

    private fun setupUI() {
        // Populate the TextViews with data
        // Example: textViewDate.text = "December 21, 2024"
    }

    private fun calculateHighestExpenses() {
        // Logic to determine the day with the highest expenses
    }

    private fun showAverageSpending() {
        // Logic to calculate and display average spending
    }
}

