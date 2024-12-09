package com.example.BudgetBuddyApp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private val Any.editTextMorningExpense : Int
    get() {}
private val Any.editTextDate : Int
    get() {}

// MainActivity.kt
class MainActivity : AppCompatActivity() {

    private lateinit var editTextDate: EditText
    private lateinit var editTextMorningExpense: EditText
    private lateinit var editTextAfternoonExpense: EditText
    private lateinit var editTextExpenseDetails: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonViewDetails: Button

    private val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val morningExpenses = DoubleArray(7)
    private val afternoonExpenses = DoubleArray(7)
    private val expenseDetails = Array(7) { "" }
    private var currentDayIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextDate = findViewById(R.id.editTextDate)
        editTextMorningExpense = findViewById(R.id.editTextMorningExpense)
        editTextAfternoonExpense = findViewById(R.id.editTextAfternoonExpense)
        editTextExpenseDetails = findViewById(R.id.editTextExpenseDetails)
        buttonSave = findViewById(R.id.buttonSave)
        buttonClear = findViewById(R.id.buttonClear)
        buttonViewDetails = findViewById(R.id.buttonViewDetails)

        buttonSave.setOnClickListener { saveData() }
        buttonClear.setOnClickListener { clearData() }
        buttonViewDetails.setOnClickListener { navigateToDetailView() }
    }

    private fun navigateToDetailView() {
        TODO("Not yet implemented")
    }

    private fun saveData() {
        if (currentDayIndex >= 7) {
            Toast.makeText(this, "All days are filled. Please clear data to enter new values.", Toast.LENGTH_SHORT).show()
            return
        }

        val morningExpense = editTextMorningExpense.text.toString().toDoubleOrNull() ?: 0.0
        val afternoonExpense = editTextAfternoonExpense.text.toString().toDoubleOrNull() ?: 0.0
        val expenseDetail = editTextExpenseDetails.text.toString()

        morningExpenses[currentDayIndex] = morningExpense
        afternoonExpenses[currentDayIndex] = afternoonExpense
        expenseDetails[currentDayIndex] = expenseDetail

        currentDayIndex++
        Toast.makeText(this, "Data saved for ${daysOfWeek[currentDayIndex - 1]}", Toast.LENGTH_SHORT).show()

        clearInputFields()
    }

    private fun clearInputFields() {
        TODO("Not yet implemented")
    }

    private fun clearData() {
        morningExpenses.fill(0.0)
        afternoonExpenses.fill(0.0)
        expenseDetails.fill("")
        currentDayIndex = 0
        Toast.makeText(this, "Data cleared.", Toast.LENGTH_SHORT).show()
    }


