package com.krillinator.lektion_7_part_two.models

// No {}, NO business logic HERE
// Mutable || Immutable
// Best practice == Immutable
// Includes: toString(), hashCode(), equals(), copy()

// ADVANCED:
// UNIQUE RULE - viewModel 'state' == no need to exclude vars

data class StudentState(
    val name: String,
    val age: Int
)
