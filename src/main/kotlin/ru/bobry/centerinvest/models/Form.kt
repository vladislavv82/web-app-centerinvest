package ru.bobry.centerinvest.models

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "forms")
    class Form(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column
    var firstName: String,

    @Column
    var lastName: String,

    @Column
    var patronymic: String,

    @Column
    var dateOfBirth: LocalDate,

    @Column
    var placeOfBirth: String,

    @Column
    var phone: String,

    @Column
    var email: String,

    @Column
    var telegram: String,

    @Column
    var specialty: String,

    @Column
    var comment: String,

    @Column
    var preferredRegion: String,

    @Column
    var appliedBefore: Boolean?= null,

    @Column
    var springExperience: Boolean?= null,

    @Column
    var kotlinExperience: Boolean?= null,

    @Column
    var restExperience: Boolean?= null
    )