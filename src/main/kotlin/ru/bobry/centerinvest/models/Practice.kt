package ru.bobry.centerinvest.models

import jakarta.persistence.*

@Entity
@Table(name = "practice")
class Practice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0

    @Column
    var title: String = ""

    @Column
    var subtitle: String = ""

}