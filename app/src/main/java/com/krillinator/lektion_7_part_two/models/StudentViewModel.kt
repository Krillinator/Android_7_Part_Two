package com.krillinator.lektion_7_part_two.models

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class StudentViewModel : ViewModel() {

    // Setup MutableStateFlow (Boilerplate Code)
    private val _studentState = MutableStateFlow(StudentState("Default", 0))
    var studentState : StateFlow<StudentState> = _studentState.asStateFlow()

    // Business Logic
    fun setName(inputName: String) {

        // Only for UI
        _studentState.update {
            it.copy(name = inputName)
            // student -> student.copy(name = "Test")
        }

    }

}