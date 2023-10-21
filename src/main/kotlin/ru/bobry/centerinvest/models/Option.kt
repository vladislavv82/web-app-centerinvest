package ru.bobry.centerinvest.models

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*

@Entity
data class Option(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column
    val text: String,
    @Column
    val isCorrect: Boolean,
    @JsonBackReference
    @ManyToOne
    val test: Test
)