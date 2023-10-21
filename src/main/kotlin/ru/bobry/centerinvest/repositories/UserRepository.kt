package ru.bobry.centerinvest.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ru.bobry.centerinvest.models.Candidat

interface UserRepository: JpaRepository<Candidat, Int> {
    fun findByEmail(email:String): Candidat?
}