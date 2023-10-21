package ru.bobry.centerinvest.models

import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*
import java.util.*

@Entity
data class Test(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column
    val title: String,
    @JsonManagedReference
    @OneToMany(mappedBy = "test", cascade = [CascadeType.ALL], orphanRemoval = true)
    var options: List<Option> = emptyList()
)
