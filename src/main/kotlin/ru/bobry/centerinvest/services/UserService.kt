package ru.bobry.centerinvest.services

import org.springframework.stereotype.Service
import ru.bobry.centerinvest.models.Candidat
import ru.bobry.centerinvest.repositories.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {

    fun save(user: Candidat): Candidat {
        return this.userRepository.save(user)
    }

    fun findByEmail(email: String): Candidat? {
        return this.userRepository.findByEmail(email)
    }

    fun getById(id: Int): Candidat {
        return this.userRepository.getById(id)
    }
}