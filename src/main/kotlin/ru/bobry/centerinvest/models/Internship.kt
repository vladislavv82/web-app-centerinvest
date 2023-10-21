package ru.bobry.centerinvest.models

import jakarta.persistence.*

@Entity
@Table(name = "internships")
class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0

    @Column
    var title: String = ""

    @Column
    var requirements: String = ""

}