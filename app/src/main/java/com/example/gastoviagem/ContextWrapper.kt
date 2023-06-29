package com.example.gastoviagem

import android.content.Context

class ContextWrapper (private val context: Context){

    fun getValue(): String {
        return context.getString(R.string.total_value)
    }
}