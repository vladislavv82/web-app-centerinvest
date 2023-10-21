package ru.bobry.centerinvest.models

import jakarta.persistence.*

@Entity
@Table(name = "vacancys")
class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0

    @Column
    var title: String = ""

    @Column
    var description: String = ""

    @Column
    var link: String = ""

}