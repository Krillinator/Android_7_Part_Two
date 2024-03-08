package com.krillinator.lektion_7_part_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.krillinator.lektion_7_part_two.databinding.ActivityMainBinding
import com.krillinator.lektion_7_part_two.models.StudentState
import com.krillinator.lektion_7_part_two.models.StudentViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    // Binding
    private lateinit var binding: ActivityMainBinding

    // ViewModel - Boilerplate Code
    private val studentViewModel: StudentViewModel by viewModels()

    // TODO - Instantiation of multiple objects
    // TODO - Global Data?
    // TODO - Extra Tasks --> ViewModels, by, lambda, data classes
    // TODO - Git & GitHub --> Recap? (BONUS)
        // git branches, git merge, git stash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Components/Widgets
        val tvStudentViewModel = binding.tvStudentViewmodel
        val btnSetStudentName = binding.btnSetStudentName

        // Update - View
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                studentViewModel.studentState.collect {

                    // Set TextView
                    tvStudentViewModel.text = it.name

                }
            }
        }

        // Listeners
        btnSetStudentName.setOnClickListener {
            studentViewModel.setName("Benny")
        }

    }
}